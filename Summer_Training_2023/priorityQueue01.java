package Summer_Training_2023;
import java.util.PriorityQueue;
// Java program to access elements
// from a PriorityQueue
import java.util.*;

class PriorityQueueDemo {

    // Main Method
    public static void main(String[] args)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println("PriorityQueue: " + pq);
        int element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
