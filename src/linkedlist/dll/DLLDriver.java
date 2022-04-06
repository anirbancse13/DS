package linkedlist.dll;

public class DLLDriver {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.insertFirst(100);
        dll.insertFirst(200);
        dll.insertFirst(300);
        dll.insertFirst(400);

        dll.display();
        System.out.println("");
        dll.displayReverse();

        dll.insertLast(1);

        dll.insertLast(2);
        System.out.println("");

        dll.insertAtPosition(66,2);
        dll.display();

        System.out.println(dll.deleteFirst());
        System.out.println(dll.deleteFirst());
        System.out.println("");
        dll.display();
        System.out.println(dll.deleteAtPosition(2));


        dll.display();
    }
}
