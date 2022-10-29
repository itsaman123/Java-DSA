package Method;

public class recursion02 {
    static int sum(int n){
        if(n==1){
            return 1;

        }
        int smallFun=sum(n-1);
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }
}
