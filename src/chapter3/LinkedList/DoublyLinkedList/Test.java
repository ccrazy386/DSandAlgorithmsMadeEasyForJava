package chapter3.LinkedList.DoublyLinkedList;

public class Test {
    public static void main(String[] args) {
        DLLNode node1 = new DLLNode(10);
        DLLNode node2 = new DLLNode(4);

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.DLLInsert(null, node1, 1);
        dll.DLLInsert(node1, node2, 2);
        System.out.println(dll.getDLLLength(node1));
    }
}
