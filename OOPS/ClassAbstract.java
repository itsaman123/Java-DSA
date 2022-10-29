package OOPS;

abstract class ClassAbstract {
    abstract void run();

}
class Honda extends ClassAbstract{
    void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        ClassAbstract obj=new Honda();
        obj.run();
    }
}
