package OOPS;

public class overloading {
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return a*b*c;

    }

    public static void main(String[] args) {
        overloading o=new overloading();
        int d=o.multiply(12,43);
        int e=o.multiply(12,2,1);
        System.out.println(d);
        System.out.println(e);
    }
}
