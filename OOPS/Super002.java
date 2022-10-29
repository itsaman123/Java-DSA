package OOPS;
//super keyword with function;

class A{
    void area(int side){
        int ar=side*side;
        System.out.println("Area of square: "+ar);
    }
}

public class Super002 extends A{
    int height=12,width=2;
    public void area(){
        int ar=height*width;
        System.out.println("Area of Rectangle is: "+ar);
        super.area(10);

    }

    public static void main(String[] args) {
        Super002 obj=new Super002();
        obj.area();
    }


}
