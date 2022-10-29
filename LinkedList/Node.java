package LinkedList;


import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }
}
class LLUse01 {
    public static Node<Integer> createLL(){
        Node<Integer> n1=new Node<Integer>(10);
        Node<Integer> n2=new Node<Integer>(20);
        Node<Integer> n3=new Node<Integer>(30);
        Node<Integer> n4=new Node<Integer>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        return n1;
    }
    public static void print(Node<Integer>head){
        int count=0;
        while(head!=null){
            System.out.print(head.data+" ");
            count++;
            head=head.next;

        }
        System.out.println();
        System.out.println("no of nodes are : " +count);
    }
    public static Node<Integer>takeInput(){
        Scanner s1=new Scanner(System.in);
        int data=s1.nextInt();
        Node<Integer>head=null;
        while(data!=-1){
            Node<Integer>currentNode=new Node<Integer>(data);
            if(head==null){
                head=currentNode;
            }else{
                Node<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data=s1.nextInt();

        }
        return head;
    }
    public static void main(String[] args) {
//        Node<Integer>head=createLL()d;
        Node<Integer>head=takeInput();

        print(head);
//        takeInput(head);
    }

}
