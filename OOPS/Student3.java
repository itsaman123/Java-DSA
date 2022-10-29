package OOPS;

public class Student3 {
    int id=5;
    String name="Aman";
//    method to display the value of id and name;
    void display(){
        System.out.println(id+" "+name);

    }
    public static void main(String args[]){
        Student3 s1=new Student3();
//        Student3 s2=new Student3();

        s1.display();
//        s2.display();
    }
}
