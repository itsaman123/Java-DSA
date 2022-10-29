package LinkedList;

import java.util.List;

public class operationOnSll {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public boolean searchKey(int key){
        ListNode current=head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public ListNode reverseLL(){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;

    }
    public ListNode findMiddleNode(){
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }
    public ListNode getFromLast(int n){
        ListNode mainPtr=head;
        ListNode firstPtr=head;
        int count=0;
        while(count<n){
            firstPtr=firstPtr.next;
            count++;
        }
        while(firstPtr!=null){
            firstPtr=firstPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        operationOnSll sll=new operationOnSll();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);
        ListNode seventh=new ListNode(7);
//        ListNode eighth=new ListNode(8);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
//        seventh.next=eighth;
//        sll.display();

//        System.out.println(sll.searchKey(8));

//        System.out.println(sll.reverseLL());
//        sll.display();

        sll.display();
        ListNode middle=sll.findMiddleNode();
        System.out.println("middle Node is - "+middle.data);

        
        ListNode fromLast=sll.getFromLast(3);
        System.out.println("element is - "+fromLast.data);






    }
}
