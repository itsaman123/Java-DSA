package Exceptionhandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileNotFound {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw=new PrintWriter("jpg.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        finally{
            System.out.println("File saved successfully!");
        }
    }
}
