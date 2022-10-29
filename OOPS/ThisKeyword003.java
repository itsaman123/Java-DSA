package OOPS;

public class ThisKeyword003 {
    void m(ThisKeyword003 obj){
        System.out.println("Method is invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        ThisKeyword003 s1=new ThisKeyword003();
        s1.p();
    }



}
