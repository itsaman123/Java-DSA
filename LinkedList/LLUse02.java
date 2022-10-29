package LinkedList;

public class LLUse02 {



    public class Node<T extends Number>{
        T data;
        LinkedList.Node<T> next;
        Node(T data){
            this.data=data;
        }
    }
    class LLUse01 {
        public static LinkedList.Node createLL(){
            LinkedList.Node<Number> n1=new LinkedList.Node<>(10);
            LinkedList.Node<Number> n2=new LinkedList.Node<>(20);
            LinkedList.Node<Number> n3=new LinkedList.Node<>(30);

            LinkedList.Node<Integer> n4=new LinkedList.Node<>(40);
            n1.next=n2;
            n2.next=n3;
//            n3.next=n4;
            n4.next=null;
            return n2;
//            System.out.println(n1);
        }

        public static void print(LinkedList.Node<Number> head){
            int count=0;
            while(head!=null){
                System.out.print(head.data+" ");
                count++;
                head=head.next;

            }
            System.out.println();
            System.out.println("no of nodesare:" +count);
        }
        public static void main(String[] args) {
            LinkedList.Node<Number> head=createLL();
            print(head);
        }
    }


}