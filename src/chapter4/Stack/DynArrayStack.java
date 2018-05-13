package chapter4.Stack;

public class DynArrayStack {
    private int top;
    private int capacity;
    private int[] array;

    public DynArrayStack() {
        this.capacity = 4;
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
            doubleStack();
        }
        array[++top] = data;
    }

    private void doubleStack() {
        int newArray[] = new int[capacity * 2];
        System.arraycopy(array, 0, newArray, 0, capacity);
        capacity = capacity * 2;
        array = newArray;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack Overflow");
            return 0;
        } else {
            return (array[top--]);
        }
    }

    public void deleteStack() {
        top = -1;
    }

}
