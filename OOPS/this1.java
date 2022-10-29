package OOPS;

public class this1 {
    int rollno;
    String name;
    float fee;
    this1(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis3 {
    public static void main(String args[]) {
        this1 s1 = new this1(111, "ankit", 5000f);
        this1 s2 = new this1(112, "sumit", 6000f);
        this1 s3 = new this1(112, "sumit", 6000f);
        s1.display();
        s2.display();
        s3.display();
    }
}