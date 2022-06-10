package ds.implementations.linkedlist.cll;

public class CircularLinkedList<T> {

    private static class Node<T>{
        private final T value;
        private Node<T> next;

        public Node(T value){
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(T value){
        Node<T> node = new Node<>(value);
        if (head == null){
            head = tail = node;
            node.next = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(T value) throws Exception {
        if (head == null){
            throw new Exception("Linked List Empty");
        }
        Node<T> temp = head;
        if (temp.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node<T> next = temp.next;
            if ( next.value == value){
                temp.next = next.next;
                break;
            }
            temp = temp.next;
        }while ( temp != head);
        size--;
    }

    public void display(){
        Node<T> temp = head;
        System.out.println("");
        if ( head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while ( temp != head);
            System.out.println(" HEAD ");
        }
    }

    public int size(){
        return size;
    }
}
