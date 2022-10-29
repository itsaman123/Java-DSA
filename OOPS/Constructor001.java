package OOPS;


//
//Constructor overloading
class Constructor001 {
    Constructor001(){
        System.out.println("default consructor");
    }
    int a;
    Constructor001(int a){
        this.a=a;

    }
    public void mymethod(){
        System.out.println("Void method of the class");

    }

    public static void main(String[] args) {
        Constructor001 obj=new Constructor001(12);
        System.out.println("age:"+obj.a);
        obj.mymethod();
    }





}