package OOPS;

public class MethodOverriding {
    void A(int a,int b){

        System.out.println("the sum of {0} and {1} is: "+a+b);
    }
}
class Now extends MethodOverriding{
    void A(int a,int b){

        System.out.println("the product of a and b is: "+a*b);

    }
    public static void main(String args[]){
        Now b=new Now();
        b.A(12,12);
    }
}