package OOPS;

class Employee1{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee1 emp1=new Employee1();
        emp1.setName("Shubham");
        System.out.println(emp1.getName());

        emp1.setId(1);
        System.out.println(emp1.getid());

    }

}
