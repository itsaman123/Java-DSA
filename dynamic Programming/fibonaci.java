package dynamicprogramming;

public class fibonaci {
//    public static int  fib(int n){ //TC--> O(n), SC--> O(n) sc is not optimized;
//        int dp[]=new int[n+1];
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<dp.length;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//
//    }
//    public static void main(String[] args) {
//        fibonaci ob=new fibonaci();
//        int n=5;
//        int dp[]=new int[n+1];
//        System.out.println(ob.fib(n));
//
//
//
//    }



    public static void main(String[] args) {

        int n=5;
        int prev=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr_i=prev+prev2;
            prev2=prev;
            prev=curr_i;
        }
        System.out.println(prev);



    }
}
