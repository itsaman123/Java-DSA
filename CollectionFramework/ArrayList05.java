package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayList05 {
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(11);
        num.add(21);
        num.add(31);

        List <Integer>res=new ArrayList<>();
        res.addAll(num);

//        System.out.println(num);
//        System.out.println(res);
//        Collections.shuffle(res);
//        System.out.println(res);
        Collections.reverse(res);
        System.out.println(res);

    }


}
