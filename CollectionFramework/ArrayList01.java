package CollectionFramework;
import java.util.List;
import java.util.ArrayList;
import java.sql.Array;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("This is arrayList of ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.add(0,100);
        System.out.println(list);
    }
}
