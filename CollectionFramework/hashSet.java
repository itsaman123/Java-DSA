package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

//        Insertion -->
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(5);
        System.out.println(set.size());
        System.out.println(set);

//        serching an element -->

//        if(set.contains(1)){
//            System.out.println("set contain");
//        }
//        if(!set.contains(45))
//            System.out.println("does not contain");
//
////        deletion>>>>
//        set.remove(1);
//        if(!set.contains(1))
//            System.out.println("does not contain 1 -we delete 1");

//        intertor -->

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
