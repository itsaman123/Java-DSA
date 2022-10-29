package OOPS;

abstract class Base2{
    public Base2(){
        System.out.println("Mai base constructor hu");

    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}




public class CWHAbstractClass {
    public static void main(String[] args) {

    }
}
