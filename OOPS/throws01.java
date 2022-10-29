package OOPS;

import java.io.IOException;

class throws01 {
    void method()throws IOException {
        throw new IOException("device error");
    }
}
class second{
    public static void main(String[] args){
        try{
            throws01 m=new throws01();
            m.method();
        }
        catch(Exception e){
            System.out.println("Exception handeled");
        }
        System.out.println("normal flow");
    }

}