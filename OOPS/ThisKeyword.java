package OOPS;

public class ThisKeyword {
    int a=20;
    static int b=144;
    void GFG(){
        this.a=100;
        System.out.println(a);
        this.b=55;
        System.out.println(b);


    }
    public static void main(String[] args){
        new ThisKeyword().GFG();

    }

}
