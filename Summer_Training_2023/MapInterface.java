package Summer_Training_2023;
import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(1,"Amit");
        map.put(2,"aman");
        map.put(3,"aarav");
        map.put(4,"aashu");
        map.put(5,"adi");
        map.put(6,"abhi");
        map.put(7,"pathak");
        map.put(8,"nidhi");
        map.put(8,"new val");
        map.remove(8);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
