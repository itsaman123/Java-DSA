package OOPS;

abstract class AbstractClass001 {
    abstract void add(int a,int b);
    abstract void sub(int c,int d);
}
class New extends AbstractClass001{
    public void add(int a,int b){
        int n=a+b;
        System.out.println(n);
    }
    public void sub(int c,int d){
        int m=c-d;
        System.out.println(m);
    }

    public static void main(String[] args) {
        New obj=new New();
        obj.add(4,5);
        obj.sub(10,4);
    }

}
