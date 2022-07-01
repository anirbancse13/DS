package ds.implementations.stack.withArr;

public class StackWithArrayDriver {

    public static void main(String[] args) throws Exception {
        StackWithArray s = new StackWithArray(3);

        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.getSize());
        s.push(20);
        System.out.println(s.getSize());
        s.push(30);
        System.out.println(s.getSize());
        System.out.println(s.peek());
        System.out.println("Popping");
        s.pop();
        System.out.println(s.getSize());
        System.out.println(s.peek());
        System.out.println("Popping");
        s.pop();
        System.out.println(s.getSize());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
