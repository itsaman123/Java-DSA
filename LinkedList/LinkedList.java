package LinkedList;
//package LinkedList;
//
//public class LL002 {
//    class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//
////    Add - first,last;
//    public void addFirst(String data){
//        Node newNode=new Node(data);
//        Node head = null;
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
////    add Last
//    public void addLast(String data){
//        Node newNode=new Node(data);
//        Node head = null;
//        if(head==null){
//            head=newNode;
//            return;
//
//        }
//        Node currNode=head;
//        while(currNode.next!=null){
//            currNode=currNode.next;
//
//        }
//        currNode.next=newNode;
//
//    }
//    public void printlist(){
//        Object head = null;
//        if(head==null){
//            Object newNode = null;
//            head=newNode;
//            return;
//
//        }
//        Node currNode=head;
//        while(currNode.next!=null){
//            currNode=currNode.next;
//
//        }
//
//
//    }
//
//
//
//
//    public static void main(String[] args) {
//        LL002 list=new LL002();
//        list.addFirst("a");
//        list.addFirst("b");
//        list.addFirst("c");
//        list.addFirst("d");
//
//        System.out.println(list);
//
//
//    }
//}


// Java program to implement
// a Singly Linked List

public class LinkedList {

    Node<Number> head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node<I extends Number> {

        int data;
        Node<Number> next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node<Number> new_node = new Node<Number>(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node<Number> last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node<Number> currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}