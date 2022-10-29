package OOPS;
class a{
    void add(){
        int x=12;
        int y=23;
        System.out.println("The sum is: "+x+y);
    }
}
class b extends a{
    void sub(){
        int x=12;
        int y=3;
        int z=x-y;
        System.out.println("The sub is: "+z);
    }
}
class c extends a{
    void mul(){
        int x=12;
        int y=4;
        int z=x*y;
        System.out.println("The mul is: "+z);
    }
}

public class Hierarchical_Inher {
    public static void main(String[] args) {
        c boj=new c();
//        b obj=new b();

        boj.mul();
        boj.add();


    }

}
