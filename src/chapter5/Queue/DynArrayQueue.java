package chapter5.Queue;

public class DynArrayQueue {
    private Integer front;
    private Integer rear;
    private Integer capacity;
    private Integer [] array;
    private DynArrayQueue() {
        capacity = 1;
        front = -1;
        rear = -1;
        array = new Integer[1];
    }

    public static DynArrayQueue createDynArrayQueue() {
        return new DynArrayQueue();
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    private boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    public Integer getQueueSize() {
        if (front == -1) {
            return 0;
        }
        Integer size = (capacity - front + rear + 1) % capacity;
        if (size == 0) {
            return capacity;
        } else {
            return size;
        }
    }

    private void resizeQueue() {
        Integer initCapacity = capacity;
        capacity *= 2;
        Integer [] oldArray = array;
        array = new Integer[this.capacity];
        
        for (Integer i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
        if (rear < front) {
            for (Integer i = 0; i < front; i++) {
                array[i + initCapacity] = this.array[i];
                array[i] = null;
            }
            rear = rear + initCapacity;
        }
    }

    public void enQueue(Integer data) {
        if (isFull()) {
            resizeQueue();
        }
        rear = (rear + 1) % capacity;
        array[rear] = data;
        if (front == -1) {
            front = rear;
        }
    }

    public int deQueue() {
        Integer data = null;
        if (isEmpty()) {
            throw new IllegalStateException("Queue Empty");
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }

    public static void main(String[] args) {
        DynArrayQueue daQueue = createDynArrayQueue();
        System.out.println(daQueue.isEmpty());
    }
}