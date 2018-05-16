package chapter4.Stack;

import chapter3.LinkedList.SinglyLinkedList.ListNode;

import java.util.EmptyStackException;
import java.util.Stack;

public class LLStack extends Stack{
    private int length;
    private LLNode headNode;

    public LLStack() {
        this.headNode = new LLNode(null);
    }

    public void Push(Integer data) {
        if (headNode == null) {
            headNode = new LLNode(data);
        } else if (headNode.getData() == null) {
            headNode.setData(data);
        } else {
            LLNode llNode = new LLNode(data);
            llNode.setNext(headNode);
            headNode = llNode;
        }
    }

    public Integer top() {
        if (headNode == null) {
            return null;
        } else {
            return headNode.getData();
        }
    }

    public Integer pop() {
        if (headNode == null) {
            throw new EmptyStackException();
        } else {
            Integer data = headNode.getData();
            headNode = headNode.getNext();
            return data;
        }
    }

    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteStack() {
        headNode = null;
    }
}
