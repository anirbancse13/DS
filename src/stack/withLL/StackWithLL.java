package stack.withLL;

public class StackWithLL {
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public StackWithLL(){
        size = 0;
        head = null;
    }

    public void push(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        size ++;
    }

    public int pop() throws Exception {
        if (size == 0){
            throw new Exception("Stack is already empty");
        }
        int value = head.data;
        head = head.next;
        size --;
        return value;
    }

    public int peek() throws Exception{
        if (head == null){
            throw new Exception("Stack is already empty");
        }
        return head.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

}
