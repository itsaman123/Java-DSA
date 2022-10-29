package OOPS;

public interface interfaceClass2 {
    void getArea(int length,int breath) ;
}
class Rectangle implements interfaceClass2{
    public void getArea(int length,int breath){
        System.out.println("The area of the rectangle is: "+(length*breath));

    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.getArea(12,12);
    }
}