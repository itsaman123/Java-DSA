package OOPS;
//by changing the data type of argumnts
public class MethodOverloading001 {
    void show(int a){
        System.out.println(a);

    }
    void show(float a){
        System.out.println(a);
    }
    void show(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        MethodOverloading001 obj=new MethodOverloading001();
        obj.show(12);
        obj.show(2.5f);
        obj.show(21.3423143,32.232232);
    }

}
