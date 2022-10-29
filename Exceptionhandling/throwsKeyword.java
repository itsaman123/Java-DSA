package Exceptionhandling;
import java.io.*;

public class throwsKeyword {
    void method()throws IOException {
        throw new IOException("Device error!");
    }
}
class test{
    public static void main(String[] args) {
        try{
            throwsKeyword m=new throwsKeyword();
            m.method();

        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
        System.out.println("normal flow");
    }
}
