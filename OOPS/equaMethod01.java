package OOPS;

public class equaMethod01 {
    public static void main(String[] args) {
        String s1="Sachin sir";
        String s2="Sachin sir";
        String s3=new String("Sachin sir");
        String s4="Sachin";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

    }
}
