package ds.implementations.stack.withLL;

public class StackWithLLDriver {

    public static void main(String[] args) throws Exception {
        StackWithLL s = new StackWithLL();

        System.out.println(s.isEmpty());

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.getSize());

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();

        System.out.println(s.getSize());

        System.out.println(s.isEmpty());

    }
}
