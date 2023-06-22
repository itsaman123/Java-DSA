package Summer_Training_2023;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("name","aman");
        hm.put("id","02");
        hm.put("Dept","ECE");
        hm.put("Salary","34000");
        System.out.println(hm);
        for(String q:hm.values()){
            System.out.println(q);
        }
        for(String q:hm.keySet()){
            System.out.println(q);
        }
    }
}
