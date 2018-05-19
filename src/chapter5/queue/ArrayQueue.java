package chapter5.queue;

public class ArrayQueue {
    private int front;
    private int rear;
    private int capacity;
    private int [] array;

    private ArrayQueue(int size) {
        capacity = size;
        front = -1;
        rear = -1;
        array = new int [size];
    }

    private static ArrayQueue createQue(int size) {
        return new ArrayQueue(size);
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    public int getQueueSize() {
        return ((capacity - front + rear + 1) % capacity);
    }

    public void enQueue(Integer data) throws NullPointerException, IllegalStateException{
        if (isFull()) {
            throw new IllegalStateException("Queue Overflow");
        } else {
            rear = (rear + 1) % capacity;
            array[rear] = data;
            if (front == -1) {
                front = rear;
            }
        }
    }

    public int deQueue() throws IllegalStateException{
        Integer data = null;
        if (isEmpty()) {
            throw new IllegalStateException("Queue Empty");
        } else {
            data = array[front];
            if (front == rear) {
                front = rear - 1;
            } else {
                front = (front + 1) % capacity;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        ArrayQueue que = createQue(4);
        que.enQueue(3);
        System.out.println(que.isFull());
    }
}