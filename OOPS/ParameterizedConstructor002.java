package OOPS;



public class ParameterizedConstructor002 {
    int roll_no;
    int age;
    String name;
    ParameterizedConstructor002(int roll_no,int age,String name){
        this.roll_no=roll_no;
        this.age=age;
        this.name=name;

    }
    public void mymethod(){
        System.out.println("this is void method");
    }
}
class display{
    public static void main(String[] args) {
        ParameterizedConstructor002 obj=new ParameterizedConstructor002(41,18,"Aman");
        obj.mymethod();
        System.out.println("My name is "+obj.name+"\nmy age is "+obj.age+"\nmy roll no is "+obj.roll_no);
    }

}
