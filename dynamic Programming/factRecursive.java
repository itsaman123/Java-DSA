package dynamicprogramming;

public class factRecursive {
    public static int fact(int n){
        if(n==1 || n==0)
            return 1;
        int a=fact(n-1);
        int res=n*a;
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));

    }
}
