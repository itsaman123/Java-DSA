package OOPS;

public class Polymorphism {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Polymorphism obj=new Polymorphism();
        System.out.println(obj.add(12,34));
        System.out.println(obj.add(12.434,3));
    }
}
