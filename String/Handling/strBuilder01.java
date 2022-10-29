package String.Handling;

public class strBuilder01 {
    public static void main(String[]args){

//        String concatenation using toString()

        StringBuilder s1=new StringBuilder("aman");
        StringBuilder s2=new StringBuilder(" maurya");
        StringBuilder s=s1.append(s2);
        System.out.println(s.toString());
//        System.out.println(s1+" "+s2);

//        using format()

        String s3=new String("Hello");
        String s4=new String(" World");
        String T=String.format("%s%s",s3,s4);
        System.out.println(T.toString());

//       using .join()

        String s5=new String("Good ");
        String s6=new String("Morning");
        String R=String.join("",s5,s6);
        System.out.println(R.toString());




    }
}
