package Summer_Training_2023;
import java.util.Deque;
import java.util.LinkedList;
public class stackUsingDeque {
    private Deque<String> stack;
    public stackUsingDeque() {
        stack = new LinkedList<>();
    }
    public void push(String item) {
        stack.push(item);
    }
    public String pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stack.pop();
    }

    public String peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
