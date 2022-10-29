package OOPS;

public class Method002 {
    static int logic(int x,int y){
        int z;
        if (x > y) {
            z=x+y;

        }else{
            z=x+y+50;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=44;
        int b=36;
        int c=logic(a,b);
        System.out.println(c);
    }

}
