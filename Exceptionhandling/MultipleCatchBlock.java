package Exceptionhandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int[] a=new int[5];
            a[5]=30/0;
//            System.out.println(a[12]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occure!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception");
        }
        catch(Exception e){
            System.out.println("parent Exception occure!");
        }
        System.out.println("Rest of code...");
    }
}
