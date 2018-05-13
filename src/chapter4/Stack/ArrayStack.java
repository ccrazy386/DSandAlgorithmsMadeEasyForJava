package chapter4.Stack;

public class ArrayStack {
    private int top;
    private int capacity;
    private int[] array;

    public ArrayStack() {
        this.capacity = 1;
        array = new int [capacity];
        top = -1;
    }

    public boolean isEmpty() {
        // 이 조건이 참이면 1이 리턴되고 아니면 0이 리턴된다.
        return (top == - 1);
    }

    public boolean isStackFull() {
        // 이 조건이 참이면 1이 리턴되고 아니면 0이 리턴된다.
        return (top == capacity - 1); // 혹은 return (top == array.length);
    }

    public void push(int data) {
        if (isStackFull()) {
            System.out.println("Stack Overflow");
        } else {
            // top을 1씩 증가시키고 데이터를 top 위치에 저장한다.
            array[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            // top == -1은 스택이 비었음을 뜻한다.
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return (array[top--]);
        }
    }

    public void deleteStack() {
        top = -1;
    }
}
