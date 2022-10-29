package Exceptionhandling;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try{
            int a[]={1,3,7,5};
            System.out.println(a[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("rest of the code");
        }
    }
}
