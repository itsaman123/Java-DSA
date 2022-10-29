package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist06 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer>res=new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(5);
        Collections.swap(res,1,2);
        System.out.println(res);
        boolean a=list.equals(res);
        System.out.println(a);
        List<Integer> ans=new ArrayList<>();
        ans.addAll(res);
        ans.addAll(list);
        System.out.println(ans);
        ans.removeAll(ans);
        System.out.println(ans);

    }
}
