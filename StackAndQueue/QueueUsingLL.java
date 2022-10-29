package StackAndQueue;

import java.util.NoSuchElementException;

public class QueueUsingLL {
    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueUsingLL(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }

    public class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public int length(){
        return length;
    }
//
    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        return front.data;
    }
    public int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        return rear.data;
    }

    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current=front;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("next");
    }





    public static void main(String[] args) {
        QueueUsingLL ob=new QueueUsingLL();
        ob.enqueue(10);
        ob.enqueue(11);
        ob.enqueue(12);
        ob.enqueue(13);
        ob.enqueue(14);
        ob.print();

        ob.dequeue();

        ob.print();
        System.out.println(ob.first());
        System.out.println(ob.last());

    }
}
