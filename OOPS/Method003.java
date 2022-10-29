package OOPS;

public class Method003 {
    void Add(){
        int a=34;
        int b=6;
        int s=a+b;
        System.out.println(s);
    }
    public static void main(String[] args) {
        Method003 r=new Method003();
        r.Disp();
        r.Add();


        }
        void Disp(){
            System.out.println("method call");
    }
}