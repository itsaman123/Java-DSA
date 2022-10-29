package OOPS;

public class Super003 {
    void eat(){
        System.out.println("eating");
    }
}
class B extends Super003{
    void eat(){
        System.out.println("eating bread");
        super.eat();
    }
    void work(){
        System.out.println("working");
        super.eat();
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.eat();
        obj.work();
    }
}

