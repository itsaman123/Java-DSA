package OOPS;

public class this2 {
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("hello n");
        this.m();
    }

    public static void main(String[] args) {
        this2 o=new this2();
//        o.m();
        o.n();
    }
}
