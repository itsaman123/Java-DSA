package com.company;

public class dp03 {

        static long stair(int n){
            long[]w=new long[n+1];
            if(n==0){
                return 1;
            }
            if(n==1 || n==2 ){
                return 1;
            }
            w[0]=1;
            w[1]=1;
            w[2]=2;
            for(int i=3;i<=n;i++){
                w[i]=w[i-1]+w[i-2]+w[i-3];
            }
            return w[n];
        }
    public static void main(String[] args) {
        System.out.println(stair(3));
    }
}