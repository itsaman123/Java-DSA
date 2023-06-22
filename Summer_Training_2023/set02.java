package Summer_Training_2023;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class set02 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("krishna", 23);
        hm.put("saritha", 34);
        hm.put("ramu", 45);
        hm.put("rani", 45);
        hm.put("sravani", 56);
        hm.put("shirisha", 56);

        System.out.println("[");

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (key.length() % 2 == 0) {
                System.out.println(key + " : " + value);
            }
        }
        System.out.println("]");
    }
}
