package ss11_DSA_stack_queue.practice.queue_linkedlist;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.toString();
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
