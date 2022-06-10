package ds.implementations.queue.dequeue;

public class DequeueWithLLDriver {

    public static void main(String[] args) throws Exception {
        DequeueWithLL<Integer> dq = new DequeueWithLL<>();

        dq.insertAtFront(10);
        dq.insertAtFront(20);
        dq.insertAtFront(30);

        dq.insertAtRear(1);
        dq.insertAtRear(2);

        System.out.println(dq.getSize());

        System.out.println(dq.getFromFront());
        System.out.println(dq.getFromRear());

        dq.deleteFromFront();
        dq.deleteFromRear();

        System.out.println(dq.getFromFront());
        System.out.println(dq.getFromRear());

        System.out.println(dq.getSize());
    }
}
