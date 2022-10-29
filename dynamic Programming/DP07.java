package com.company;

public class DP07 {
    public int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }


//    using top down or memoization -->

    public int fib(int[]memo, int n){
        if(memo[n]==0)
            if(n<2){
                memo[n]=n;

            }else{
                memo[n]=fib(memo,n-1)+fib(memo,n-2);
            }
        return memo[n];
    }

    public static void main(String[] args) {
        DP07 ob=new DP07();

        System.out.println(ob.fib(0));
        System.out.println(ob.fib(new int[6+1],6));
    }

}
