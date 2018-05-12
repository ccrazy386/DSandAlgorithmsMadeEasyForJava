package chapter3.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {

    // 리스트의 길이를 구하는 메소드
    int ListLength (ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;

        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    // 노드 삽입
    ListNode InsertInLinkedList (ListNode headNode, ListNode nodeToInsert, int position) {
        if (headNode == null) {
            // 최초로 설정
            return nodeToInsert;
        }

        int size = ListLength(headNode);

        if (position > size + 1 || position < 1) {
            System.out.println("Position of node to insert is invalid. The Valid inputs are 1 to " + (size + 1));
            return headNode;
        }
        if (position == 1) { // 첫 노드를 삽입한다.
            nodeToInsert.setNext(headNode);
        } else { // 중간과 끝에 노드를 삽입한다.
            ListNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
        }

        return headNode;
    }

    // 노드 삭제
    ListNode DeleteNodeFromLinkedList(ListNode headNode, int position) {
        int size = ListLength(headNode);
        if (position > size || position < 1) {
            System.out.println("Position of node to delete is invalid. The valid inputs are 1 to " + size);
            return headNode;
        }
        if (position == 1) { // 리스트 가장 앞에서 삭제
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        } else { // 끝에 닿을 때까지 내부에서 노드 삭제
            ListNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode = null;
        }
        return headNode;
    }

    void DeleteLinkedList(ListNode head) {
        ListNode auxilayNode, iterator = head;
        while (iterator != null) {
            auxilayNode = iterator.getNext();
            iterator = null; // 자바에서 이 부분은 가비지 컬렉터에 의해 관리됨
            iterator = auxilayNode; // 실제로 중요하지 않은 구현
        }
    }
}