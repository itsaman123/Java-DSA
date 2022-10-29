package OOPS;

public class MultilevelInheritance {
    void A(){
        int clas=7;
        int Student=60;
        System.out.println(clas+"th class have "+Student+" Students!");
    }
}
class cat extends MultilevelInheritance{
    void obc(){
        int a=112;
        int b=211;
        int c=a-b;
        System.out.println(c);
    }
}
class dog extends cat{
    void Animal(){
        int street=1233;
        int city=1222;
        int c=street + city;
        System.out.println(c);
    }
}
class _final{
    public static void main(String[] args) {
        dog obj=new dog();
        obj.A();
        obj.obc();
        obj.Animal();
    }

}