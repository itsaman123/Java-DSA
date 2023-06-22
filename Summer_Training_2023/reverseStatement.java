package Summer_Training_2023;
import java.util.Stack;
public class reverseStatement {
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        st.push("Hi i am aman maurya");

        for(int i=0;i<st.size();i++){
            System.out.println(st.pop());
        }
    }
}
