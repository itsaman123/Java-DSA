package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayLisr01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(12);
        arr.add(13);
        arr.add(1,0000012);
        ArrayList<Integer> newList=new ArrayList<>();
        newList.add(01);
        newList.add(02);
        arr.addAll(0,newList);
        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr.get(1));
//        arr.clear();
//        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println("the list element is "+arr.get(i));
        }
        for(int j:arr){
            System.out.print(j+" ");
        }

        Iterator<Integer>it=arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
