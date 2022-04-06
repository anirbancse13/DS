package linkedlist.dll;

public class DoublyLinkedList<T> {

    private static class Node<T>{
        private final T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value){
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    public void insertFirst(T value){
        Node<T> node = new Node<>(value);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
        if ( tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(T value){
        if (head == null){
            System.out.println(" No value in LinkedList");
        }
        Node<T> node = new Node<>(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPosition(T value, int pos) throws Exception {
        if (pos < 0 && pos > size){
            throw new Exception("Invalid position");
        }
        if (pos == 0) insertFirst(value);
        if (pos == size) insertLast(value);

        Node<T> node = new Node<>(value);
        Node<T> prev = get(pos-1);
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        size++;
    }

    public T deleteFirst() throws Exception{
        if ( head == null){
            throw new Exception("Linked List empty");
        }
        T value = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public T deleteLast() throws Exception{
        if (head == null){
            throw new Exception("Linked List empty");
        }
        T value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    public T deleteAtPosition(int pos)throws Exception{
        if (pos < 0 && pos >= size){
            throw new Exception("Invalid position");
        }
        if ( head == null){
            throw new Exception("Linked list empty");
        }
        if (pos == 0) deleteFirst();
        if (pos == size-1) deleteLast();
        Node<T> node = get(pos);
        T value = node.value;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return  value;
    }

    public Node<T> get(int pos){
        Node<T> temp = head;
        for ( int i = 0; i< pos; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

    public void displayReverse(){
        Node<T> temp = tail;
        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.print(" START ");
    }

    public int size(){
        return size;
    }
}
