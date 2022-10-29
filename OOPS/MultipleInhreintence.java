package OOPS;

interface MultipleInhreintence {
    default void add(){
//        System.out.println("1");
    }
}class Substraction{
    void sub(){
        int x=2,y=4,z;
        z=x-y;
        System.out.println(z);
    }

}
class Multiplication extends Substraction implements MultipleInhreintence{
    public void add(){
        int x=3,y=6,z;
        z=x+y;
        System.out.println(z);

    }
    void multi(){
        int x=4,y=5,z;
        z=x*y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Multiplication obj=new Multiplication();
        obj.add();
        obj.sub();
        obj.multi();
    }
}
