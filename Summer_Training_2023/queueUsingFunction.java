package Summer_Training_2023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueUsingFunction {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Rear");
            System.out.println("5. Size");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to enqueue: ");
                    int element = scanner.nextInt();
                    enqueue(queue, element);
                    break;
                case 2:
                    dequeue(queue);
                    break;
                case 3:
                    System.out.println("Front: " + front(queue));
                    break;
                case 4:
                    System.out.println("Rear: " + rear(queue));
                    break;
                case 5:
                    System.out.println("Size: " + size(queue));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void enqueue(Queue<Integer> queue, int item) {
        queue.add(item);
        System.out.println("Enqueued: " + item);
    }

    private static void dequeue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue.");
            return;
        }

        int item = queue.poll();
        System.out.println("Dequeued: " + item);
    }

    private static int front(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queue.peek();
    }

    private static int rear(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int size = queue.size();
        int lastItem = 0;
        for (int i = 0; i < size; i++) {
            lastItem = queue.poll();
            queue.add(lastItem);
        }

        return lastItem;
    }

    private static int size(Queue<Integer> queue) {
        return queue.size();
    }
}
