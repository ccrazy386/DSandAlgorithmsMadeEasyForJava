package chapter3.LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(); //
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(3);
        sll.InsertInLinkedList(null, node1, 1);
        sll.InsertInLinkedList(node1, node2, 2);

        System.out.println(sll.ListLength(node1));
    }
}
