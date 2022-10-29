package String.Handling;
import java.util.*;
public class testSubString {
    public static void main(String[]args){
        String s="SachinTendulkar";
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(6));
        System.out.println(s.substring(3,7));

//        String.split() method;
        String text= new String("Hello, My, name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
