package chapter3.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {

    // 리스트의 길이를 구하는 메소드
    int getDLLLength (DLLNode headNode) {
        int length = 0;
        DLLNode currentNode = headNode;

        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    DLLNode DLLInsert(DLLNode headNode, DLLNode nodeToInsert, int position) {
        if (headNode == null) { // 시작 부분에 삽입한다.
            return nodeToInsert;
        }
        int size = getDLLLength(headNode);

        if (position > size + 1 || position < 1) {
            System.out.println("Position of node to insert is invalid. The Valid inputs are 1 to " + (size + 1));
            return headNode;
        }

        if (position == 1) { // 머리 부분에 노드를 삽입한다.
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);
            return nodeToInsert;
        } else { // 끝이 될 때까지 중간에 노드를 삽입한다.
            DLLNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);

            if (currentNode != null) {
                currentNode.setPrevious(nodeToInsert);
            }

            previousNode.setNext(nodeToInsert);
            nodeToInsert.setPrevious(previousNode);
        }
        return headNode;
    }

    DLLNode DLLDelete(DLLNode headNode, int position) {
        int size = getDLLLength(headNode);
        // 위치가 주어진 연결리스트의 사이즈보다 클 경우 폐기한다
        if (position > size || position < 1) {
            System.out.println("Position of node to delete is invalid. The valid inputs are 1 to " + size);
            return headNode;
        }
        if (position == 1) { // 시작 노드를 삭제
            DLLNode currentNode = headNode.getNext();
            headNode = null;
            currentNode.setPrevious(null);
            return currentNode;
        } else { // 끝이 될 때까지 내부의 노드를 삭제
            DLLNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            DLLNode laterNode = currentNode.getNext();
            previousNode.setNext(laterNode);
            if (laterNode != null) {
                // 마지막 노드가 null이 아닐 경우엔 이전 노드를 null로 설정
                laterNode.setPrevious(previousNode);
            }
            currentNode = null;
        }
        return headNode;
    }
}