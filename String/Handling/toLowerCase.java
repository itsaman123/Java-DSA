package String.Handling;
import java.util.Scanner;
public class toLowerCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper case : ");
        String n=sc.nextLine();
        System.out.println("Enter the lower case: ");
        String m=sc.nextLine();
        Integer a=12;

        System.out.println("The Lower case is: "+n.toLowerCase());
        System.out.println("The upper case is: "+m.toUpperCase());

        System.out.println(a.toString());
    }
}
