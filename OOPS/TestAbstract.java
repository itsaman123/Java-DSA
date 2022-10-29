package OOPS;

abstract class TestAbstract
{
    //declaring abstract method
    abstract void rectangle_area(int height,int width);
    abstract void square_area(int side);
    abstract void circle_area(float radius);
}
//extending abstract class
class Easy extends TestAbstract
{
    //implementing abstrcat method of abstract class
    public void rectangle_area(int height,int width)
    {
        int ar=height*width;
        System.out.println("Area of rectangle="+ar);
    }
    //implementing abstrcat method of abstract class
    public void square_area(int side)
    {
        int ar=side*side;
        System.out.println("Area of square="+ar);
    }
    //implementing abstrcat method of abstract class
    public void circle_area(float radius)
    {
        float ar=3.14f*radius*radius;
        System.out.println("Area of circle="+ar);
    }
    public static void main(String[] args)
    {
        //creating instance of derived class
        Easy obj=new Easy();
        //calling abstract method
        obj.rectangle_area(12, 13);
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}