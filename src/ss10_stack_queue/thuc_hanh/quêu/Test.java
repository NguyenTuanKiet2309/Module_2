package ss10_stack_queue.thuc_hanh.quêu;

import com.sun.jmx.remote.internal.ArrayQueue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
