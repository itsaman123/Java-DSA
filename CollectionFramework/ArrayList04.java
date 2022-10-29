package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayList04 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(15);
        num.add(10);
        int min=Collections.min(num);
        int max=Collections.max(num);
        Collections.swap(num,3,1);
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println(num);

    }
}
