package Summer_Training_2023;
import java.util.Scanner;
import java.util.EmptyStackException;
class Stack {
    private Node top;
    private int size;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class stackusingFunction {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed into the stack.");
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println(poppedElement + " popped from the stack.");
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot pop element.");
                    }
                    break;
                case 3:
                    try {
                        int peekedElement = stack.peek();
                        System.out.println("Top element: " + peekedElement);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}