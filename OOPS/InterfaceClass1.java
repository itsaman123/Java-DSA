package OOPS;

interface InterfaceClass1 {
    void Hello();


}
class A6 implements InterfaceClass1{
    public void Hello()
    {

        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 obj=new A6();
        obj.Hello();

    }
}
