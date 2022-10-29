package OOPS;

//by changing the number of arguments

public class Meth_Overloading {
    void show(){
        System.out.println("this is first class");
    }
    void show(int a){

        System.out.println(a);
    }
    void show(int a,int b){
        System.out.println("this is 3rd method");
    }

    public static void main(String[] args) {
        Meth_Overloading obj=new Meth_Overloading();
        obj.show();
        obj.show(10);
        obj.show(3,4);
    }
}

