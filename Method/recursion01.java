package Method;

public class recursion01 {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
//            int smallAns = fact(n - 1);
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        int n=3;
        int ans=fact(n);
        System.out.println(ans);
    }
}
