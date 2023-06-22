package Summer_Training_2023;

import java.util.ArrayList;

public class performCollectionOp {
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(1,3);
        System.out.println(ls);
        ls.remove(0);
//        ls.add()
        System.out.println(ls);
    }
}
