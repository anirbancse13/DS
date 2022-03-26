package queue;

public class QueueWithLLDriver {

    public static void main(String[] args) throws Exception {
        QueueWithLL<Integer> queue = new QueueWithLL<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
