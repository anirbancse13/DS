package ds.implementations.queue.simplequeue;

public class QueueWithLL<T> {

     static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
        }
    }

    private Node<T> head, tail;

     public void enqueue(T data){
         Node<T> node = new Node<>(data);

         if (head == null){
             head = tail = node;
         }

         tail.next = node;
         tail = node;

     }

     public T dequeue() throws Exception {
        if (head == null){
            throw new Exception("Queue already empty");
        }
        T result = head.data;
        head = head.next;
        return result;
     }
}
