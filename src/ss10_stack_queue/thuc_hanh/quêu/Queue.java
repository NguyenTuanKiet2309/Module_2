package ss10_stack_queue.thuc_hanh.quêu;

import java.util.Arrays;

public class Queue {
    private int capacity = 10;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public Queue() {
    }

    public Queue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public Queue(int capacity, int[] queueArr, int head, int tail, int currentSize) {
        this.capacity = capacity;
        this.queueArr = queueArr;
        this.head = head;
        this.tail = tail;
        this.currentSize = currentSize;
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "capacity=" + capacity +
                ", queueArr=" + Arrays.toString(queueArr) +
                ", head=" + head +
                ", tail=" + tail +
                ", currentSize=" + currentSize +
                '}';
    }
}
