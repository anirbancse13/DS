package linkedlist.sll;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        size = 0;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;

        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void insertFirst(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(T value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node<T> node = new Node<>(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPosition(T value, int pos) throws Exception {
        if (pos < 0 || pos > size) {
            throw new Exception("Invalid position");
        }
        if (pos == 0) {
            insertFirst(value);
            return;
        }
        if (pos == size) {
            insertLast(value);
            return;
        }
        Node<T> temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node<T> node = new Node<>(value, temp.next);
        temp.next = node;
        size++;
    }

    public T deleteFirst() {
        if (size == 0) {
            System.out.println("No value to delete");
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public T deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node<T> secondLast = get(size - 2);
        T value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public T deleteAtPosition(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid position");
        }
        if (pos == 0) {
            deleteFirst();
        }
        if (pos == size - 1) {
            deleteLast();
        }
        Node<T> prev = get(pos - 1);
        T value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public Node<T> get(int pos) {
        Node<T> temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node<T> find(T value) {
        if (head == null) {
            return null;
        }
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    public int size(){
        return size;
    }

}
