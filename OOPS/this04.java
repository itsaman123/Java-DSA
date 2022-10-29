package OOPS;

public class this04 {
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
        this.m();
    }

    public static void main(String[] args) {
        this04 o=new this04();
        o.n();

    }
}
