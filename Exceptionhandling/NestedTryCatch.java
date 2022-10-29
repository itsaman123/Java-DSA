package Exceptionhandling;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number: ");
        int index=sc.nextInt();
        try{
            System.out.println("welcome");
            try{
                System.out.println(marks[index]);
            }
            catch(Exception e){
                System.out.println("Sorry this index is not exist!");
                System.out.println("Exception in level 2");

            }

        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }

    }
}
