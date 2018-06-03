package chapter5.Queue;

import chapter4.Stack.LLNode;

public class LLQueue {

    private LLNode frontNode;
    private LLNode rearNode;

    private LLQueue() {
        this.frontNode = null;
        this.rearNode = null;
    }

    public static LLQueue createQueue() {
        return new LLQueue();
    }

    public boolean isEmpty() {
        return (frontNode == null);
    }

    public void enQueue(Integer data) {
        LLNode newNode = new LLNode(data);

        if (rearNode != null) {
            rearNode.setNext(newNode);
        }

        rearNode = newNode;

        if (frontNode == null) {
            frontNode = rearNode;
        }
    }

    public Integer deQueue() {
        Integer data = null;
        if (isEmpty()) {
            throw new IllegalStateException("Queue Empty");
        } else {
            data = frontNode.getData();
            frontNode = frontNode.getNext();
        }
        return data;
    }

    public static void main(String[] args) {
        LLQueue llQueue = createQueue();

        llQueue.enQueue(10);
        System.out.println(llQueue.isEmpty());
    }
}
