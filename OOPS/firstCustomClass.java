package OOPS;

class Employee{
    int id;
    String name;
}
public class firstCustomClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class.");

        Employee harry=new Employee();
        harry.id=12;
        harry.name="aman";
        System.out.println(harry.id);
        System.out.println(harry.name);

    }
}
