package stack.withArr;

public class StackWithArray {

    private int data[];
    private int capacity;
    private int top;

    public StackWithArray(int capacity) {
        this.capacity = capacity;
        top = -1;
        data = new int[capacity];
    }

    public void push(int value) throws Exception {
        if (top == capacity - 1) {
            throw new Exception("Stack is already full");
        }
        top++;
        data[top] = value;
    }

    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is already empty");
        }
        int value = data[top];
        top--;
        return value;
    }

    public int peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is already empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int getSize(){
        return top+1;
    }
}
