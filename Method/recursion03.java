package Method;

import java.util.Scanner;

public class recursion03 {
    static int powerOf(int x,int n){
        if(x==0 && n==0){
            return 0;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallAns=powerOf(x,n/2);
        if(n%2==0){
            return smallAns*smallAns;
        }
        else{
            return x*smallAns*smallAns;
        }


    }
    public static void main(String[] args) {
        int x=3;
        int n=4;
        System.out.println(powerOf(x,n));

    }
}
