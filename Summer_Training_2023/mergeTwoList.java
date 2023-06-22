package Summer_Training_2023;
import java.util.*;

public class mergeTwoList {
    public static void main(String[] args) {

        List<String> keys = Arrays.asList("aman", "adi", "aarav");
        List<Integer> values = Arrays.asList(1, 2, 3);
        List<String>lsit=new ArrayList<>(keys);//copying list;
        System.out.println(lsit);
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            hashMap.put(keys.get(i), values.get(i));
        }

         for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
