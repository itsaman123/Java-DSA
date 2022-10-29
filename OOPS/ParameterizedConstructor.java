package OOPS;

class ParameterizedConstructor {
    int a;
    String b;
    ParameterizedConstructor(int a,String b){
        this.a=a;
        this.b=b;
    }
}
class Aman{
    public static void main(String[] args) {
        ParameterizedConstructor obj=new ParameterizedConstructor(12,"aman");
        System.out.println("Geek name: "+obj.b+"\nGeek id: "+obj.a);

    }
}

