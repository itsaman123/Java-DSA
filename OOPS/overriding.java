package OOPS;

public class overriding {
    void add(int a,int b){
        int y=a+b;
        System.out.println("the addition is: "+y);
    }
}
class second1 extends overriding{
    void add(int a,int b){
        int z=a*b;
        System.out.println("the mul is: "+z);
    }

    public static void main(String[] args) {
        second1 o=new second1();
        o.add(12,2);
//        o.add(4,5);


    }
}
