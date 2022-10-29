package OOPS;

public class Super004 {
    Super004(){
        System.out.println("animal created");
    }
}
class S extends Super004{
    S(){
        super();
        System.out.println("this is inside child class...");
    }

    public static void main(String[] args) {
        S obj=new S();


    }
}
