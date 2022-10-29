package OOPS;

public class Method001 {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+1;
        }else{
            z=(x+y)*5;
        }
        return z;

    }
    public static void main(String[] args){
        int a=7;
        int b=6;
        int c;
        c=logic(a,b);
        int a1=6;
        int b1=45;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);



    }

}
