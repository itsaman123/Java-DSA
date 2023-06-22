package Summer_Training_2023;

import java.util.HashMap;

public class Hashmap01 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"aman");
        hm.put(2,"aarav");
        hm.put(3,"ashu");
        hm.put(5,"23");
        System.out.println(hm);
        System.out.println(hm.containsKey(3));
        System.out.println(hm.size());
        System.out.println(hm.get(2));
        System.out.println(hm.containsValue("aman1"));

        hm.remove(5);
        System.out.println(hm);
    }
}



