package Exceptionhandling;

//Handling the / by zero exception;

public class Zero002 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try{
            data=i/j;
        }      //handling the exception;
        catch(Exception e){
            System.out.println(i/(j+2));
        }
        finally{
            System.out.println("rest of the code");
        }
    }
}
