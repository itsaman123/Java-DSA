package Summer_Training_2023;
import java.util.HashMap;
public class StudentDisc01 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("sname","aman");
        hm.put("Sid","04");
        hm.put("dept","CSE");
        hm.put("sub","Java");
        hm.put("sname","Aditya");
        System.out.println(hm);

        System.out.println("Keys are : ");
        for(String i:hm.keySet()){
            System.out.println(i);
        }
        System.out.println("Values are: ");
        for(String i:hm.values()){
            System.out.println(i);
        }
    }
}
