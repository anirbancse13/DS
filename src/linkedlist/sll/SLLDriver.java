package linkedlist.sll;

public class SLLDriver {

    public static void main(String[] args) throws Exception {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.insertFirst(10);
        sll.insertFirst(20);
        sll.insertFirst(30);
        sll.insertFirst(40);

        sll.insertLast(100);


        sll.insertAtPosition(99,3);

        sll.display();



        System.out.println(sll.deleteFirst());

        sll.display();

        System.out.println(sll.deleteLast());

        sll.display();

        System.out.println(sll.deleteAtPosition(1));

        sll.display();

        System.out.println(sll.find(30));
    }
}
