package Summer_Training_2023;


import java.util.HashMap;
import java.util.Map;

public class nestedHashMap {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> studentMarks = new HashMap<>();

        Map<String, Integer> ramuMarks = new HashMap<>();
        ramuMarks.put("maths", 65);
        ramuMarks.put("physics", 78);
        ramuMarks.put("chemistry", 90);
        studentMarks.put("Ramu", ramuMarks);
        System.out.println("Ramu");
        for(Map.Entry<String,Integer>e:ramuMarks.entrySet()){
            System.out.println(e);
        }

        Map<String, Integer> rajuMarks = new HashMap<>();
        rajuMarks.put("maths", 65);
        rajuMarks.put("physics", 78);
        rajuMarks.put("chemistry", 90);
        studentMarks.put("Raju", rajuMarks);

        Map<String, Integer> saritaMarks = new HashMap<>();
        saritaMarks.put("maths", 65);
        saritaMarks.put("physics", 78);
        saritaMarks.put("chemistry", 90);
        studentMarks.put("Sarita", saritaMarks);

        System.out.println(studentMarks);








    }
}
