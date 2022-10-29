package OOPS;

public class Factorial_recursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;

        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        int m=5;
        System.out.println("Factorial is: "+fact(m));
    }
}
