package linkedlist.sll;

public class SingleLinkedList<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size = 0;

    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
        size++;
    }

    public void deleteAtHead() throws Exception {
        if (isEmpty()){
            throw new Exception("No element in Linked list");
        }
        head = head.next;
        size--;
    }

    public void insertAtEnd(T data) {
        Node<T> node = new Node<>(data);
        if (size == 0) {
            insertAtHead(data);
        }
        Node<T> temp;
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        temp = node;
        size++;
    }

    public void deleteAtEnd() throws Exception {
        if (isEmpty()){
            throw new Exception("No element in Linked list");
        }
        Node<T> temp = head;
        Node<T> prev = head;
        while(temp.next !=null){
            prev = temp;
            temp =temp.next;
        }
        prev.next = null;
        temp = prev;
        size--;
    }

    public void insertAtIndex(T data, int index) throws Exception {
        Node<T> temp = head;
        Node<T> prev = head;
        Node<T> node = new Node<>(data);
        if (index == 0) {
            insertAtEnd(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }
        if (index > size) {
            throw new Exception("Invalid position");
        }
        int counter = 0;
        while (counter != index) {
            prev = temp;
            temp = temp.next;
            counter++;
        }
        prev.next = node;
        node.next = temp;
        size++;
    }

    public void deleteAtIndex(int index) throws Exception {
        if (index==0){
            deleteAtHead();
        }
        if(index == size-1){
            deleteAtEnd();
        }
        if (index>=size){
            throw  new Exception("invalid index");
        }
        int counter =0;
        Node<T> temp = head;
        Node<T> prev = head;
        while(counter != index){
            prev = temp;
            temp = temp.next;
            counter++;
        }
        prev.next = temp.next;
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
