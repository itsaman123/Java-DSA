package String.Handling;
//String buffer exapmle;
public class insertString {
    public static void main (String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(2,"java");
        System.out.println(sb);
    }

}
