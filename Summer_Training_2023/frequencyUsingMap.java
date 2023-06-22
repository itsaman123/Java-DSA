package Summer_Training_2023;
import java.util.*;
public class frequencyUsingMap {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3};
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ar.add(arr[i]);
        }

        Map<Integer,Integer>map=new HashMap<>();
        for(int i:ar){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(int i:map.keySet()){
            if(i>3){
                System.out.println(i);
            }
        }


    }
}
