package LinkedList;
//usig collection framework;
import java.util.LinkedList;

public class LL001 {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(5);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(0,100);
        l.add(1,0);

        l.remove(2);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i)+" ");


        }




    }

}
