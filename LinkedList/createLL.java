package LinkedList;

import java.util.LinkedList;

public class createLL {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.set(4,0000);
        list.remove(3);
        list.add(3,100);
//        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
//        OR
        for(int j:list){
            System.out.print("\n"+j+" ");
        }

    }

}
