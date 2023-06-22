package Summer_Training_2023;

import java.util.*;

public class removeDoublicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        System.out.println("Original list: " + numbers);
        Set<Integer> st=new HashSet<>();
        for(int i:numbers){
            st.add(i);
        }
        System.out.println(st);
    }
}



