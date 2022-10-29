package OOPS;
import java.util.Scanner;
public class abc {
    void string1() {


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first class string:" );

        String n=sc.nextLine();

        System.out.print("First class string is : "+n);
    }

}

class secondClass extends abc{





    void string2(){



        Scanner a=new Scanner(System.in);

        System.out.print("\nEnter the second class string: ");
        String m=a.nextLine();
        System.out.println("Second class string is: "+m);

    }

    public static void main(String [] args) {
        secondClass obj=new secondClass();

        obj.string1();

        obj.string2();

    }
}




