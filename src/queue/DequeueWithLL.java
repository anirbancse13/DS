package queue;

public class DequeueWithLL<T> {

    static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;

         Node(T data){
             this.data = data;
             this.next = this.prev = this;
        }
    }

    private Node<T> head, tail;
    private int size = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void insertAtFront(T data){
        Node<T> newNode =  new Node<>(data);
        if (head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void insertAtRear(T data){
        Node<T> newNode = new Node<>(data);
        if (tail == null){
            head = tail = newNode;
        }
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    public T deleteFromFront() throws Exception {
        if (head == null){
            throw new Exception("Queue already empty");
        }
        T result = head.data;
        head = head.next;
        if ( head == null){
            tail = null;
        }else{
            head.prev = null;
        }
        size --;
        return result;
    }

    public T deleteFromRear() throws Exception {
        if (tail == null){
            throw new Exception("Queue already empty");
        }
        T result = tail.data;
        tail = tail.prev;
        size--;
        if (tail == null) {
            head = null;
        }else {
            tail.next = null;
        }
        return  result;
    }

    public T getFromFront() throws Exception {
        if (head == null){
            throw new Exception("Queue is empty");
        }
        return head.data;
    }

    public T getFromRear() throws Exception {
        if (tail == null){
            throw new Exception("Queue is empty");
        }
        return tail.data;
    }
}
