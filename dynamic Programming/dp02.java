package com.company;

import java.util.Scanner;

public class dp02 {
    static int fibb(int n){
        if(n==0 || n==1){
            return n;
        }
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];


    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []dp=new int[n+1];
//        for(int i=1;i<dp.length;i++){
//            dp[i]=-1;
//        }
//        int ans=fibb(n);
//        System.out.println(ans);

//        System.out.println(fibb(5));
        System.out.println(fibb(8));

    }
}
