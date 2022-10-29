package Exceptionhandling;

public class Zero001 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try{
            int c=a/b;

        }
        catch (ArithmeticException e){
            System.out.println(e+"\ncannot divide by zero");

        }
//        finally{
//            int d=2;
//            int f=0;
//
//            System.out.println("\nthis is always executed\n"+f/d);
//
//        }


    }

}

