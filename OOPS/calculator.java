package OOPS;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        int a,b,c,ch=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your choice:");
        a=r.nextInt();
        System.out.println("enter the value of a");
        b=r.nextInt();
        System.out.println("enter the second number");
        switch(ch) {
            case 1:
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                c = a * b;
                System.out.println(c);
                break;


            default:
                System.out.println("Invalid choice");
        }

    }
}
