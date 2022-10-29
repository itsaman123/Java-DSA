package OOPS;

import java.sql.SQLOutput;

public class ConstGeek {
    String name;
    int id;

    ConstGeek(String name,int id){
        this.name=name;
        this.id=id;
    }

}
class GFG{
    public static void main(String[] args) {
        ConstGeek geek1=new ConstGeek("adam",1);
        System.out.println("Geek name"+" "+geek1.name+" and geek id :"+geek1.id);
    }
}
