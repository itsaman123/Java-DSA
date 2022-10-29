package OOPS;

public class divideByZeroExc {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        int c;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e+"\nhandled");


        }
        finally{
            System.out.println("this is outside of catch block");
        }
    }
}
