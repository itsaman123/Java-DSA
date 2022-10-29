package com.company;

public class dp06 {
    public static int minSquareI(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int minAns=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int currAns=dp[i-(j*j)];
                if(minAns>currAns){
                    minAns=currAns;
                }
            }
            dp[i]=1+minAns;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=7;
        int ans=minSquareI(n);
        System.out.println(ans);
    }
}
