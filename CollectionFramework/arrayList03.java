package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Collection.sort Method();
public class arrayList03 {
    public static void main(String[] args) {
        List<String> num=new ArrayList<>();
//        num.add("12");
//        num.add("13");
//        num.add("1");
//        num.add("45");
//        num.add("4");
        num.add("Rahul");
        num.add("Aman");
        num.add("Amar");


        System.out.println("Before:"+num);

        Collections.sort(num);
        System.out.println("After: "+num);
    }
}
