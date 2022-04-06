package linkedlist.cll;

public class CLLDriver {

    public static void main(String[] args) throws Exception {
        CircularLinkedList<Integer> cll = new CircularLinkedList<>();

        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);

        cll.display();

        cll.delete(3);

        cll.display();

        cll.delete(1);

        cll.display();

        cll.delete(5);

        cll.display();
    }
}
