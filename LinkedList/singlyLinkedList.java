package LinkedList;

//LINKED-LIST INSERTION AND DELETION;


public class singlyLinkedList {
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
    public int lengthOfLL(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertFirst(int val){
        ListNode newNode=new ListNode(val);
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insertInBetween(int position, int val){
        ListNode node=new ListNode(val);
        if(position==1){
            node.next=head;
            head=node;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node;
        }
    }

//    DELETION IN SINGLY LINKED-LIST;
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    public void deleteInBetween(int position){
        if(position==1){
            head=head.next;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }




    public static void main(String[] args) {
        singlyLinkedList sll=new singlyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

//        System.out.println("length of the LL is: "+sll.lengthOfLL());
//        sll.insertFirst(11);
//        sll.insertFirst(8);
//        sll.insertFirst(1);



//        sll.insertLast(8);
//        sll.insertLast(1);
//        sll.insertLast(34);
//        sll.display();

//        sll.insertInBetween(1,8);
//        sll.insertInBetween(2,12);
//        sll.insertInBetween(4,18);
//        sll.insertInBetween(5,0);
//        sll.display();

//        DELETION
//        System.out.println(sll.deleteFirst().data);
//        System.out.println(sll.deleteFirst().data);
//        System.out.println(sll.deleteFirst().data);
//        sll.display();

//        System.out.println(sll.deleteLast().data);
//        sll.display();

        sll.deleteInBetween(3);
        sll.deleteInBetween(1);
        sll.deleteInBetween(2);
        sll.deleteInBetween(1);
        sll.display();



    }
}
