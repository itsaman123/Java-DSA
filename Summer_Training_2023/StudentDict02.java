package Summer_Training_2023;

import java.util.HashMap;
import java.util.Map;

public class StudentDict02 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> studentMarks = new HashMap<>();

        Map<String, Integer> ramuMarks = new HashMap<>();
        ramuMarks.put("maths", 65);
        ramuMarks.put("physics", 78);
        ramuMarks.put("chemistry", 90);
        studentMarks.put("Ramu", ramuMarks);
        System.out.println("Ramu");
        int sum=0;
        for(int i: ramuMarks.values()){
            sum+=i;
        }
        System.out.println("-----");
        System.out.println(sum);

        Map<String, Integer> rajuMarks = new HashMap<>();
        rajuMarks.put("maths", 65);
        rajuMarks.put("physics", 78);
        rajuMarks.put("chemistry", 90);
        studentMarks.put("Raju", rajuMarks);
        int sum2=0;
        for(int i: rajuMarks.values()){
            sum2+=i;
        }
        System.out.println("Raju");
        System.out.println("-----");
        System.out.println(sum2);

        Map<String, Integer> saritaMarks = new HashMap<>();
        saritaMarks.put("maths", 65);
        saritaMarks.put("physics", 78);
        saritaMarks.put("chemistry", 90);
        studentMarks.put("Sarita", saritaMarks);
        int sum3=0;
        for(int i: saritaMarks.values()){
            sum3+=i;
        }
        System.out.println("Sarita");
        System.out.println("-----");
        System.out.println(sum3);


//        System.out.println(studentMarks);
    }
}
