package OOPS;

public class HybridInheritance {
    void show(){
        System.out.println("1");
    }
}
class Father extends HybridInheritance{
    void show(){
        System.out.println("2");
    }
}
class Child1 extends Father{
    void show(){
        System.out.println("3");
    }
}
class Child2 extends Father{
    void show(){
        System.out.println("4");
    }

    public static void main(String[] args) {
        Child1 obj=new Child1();
        obj.show();
    }
}