package Method;

public class recursion05 {
    static int printNumber(int n){
//        int count;
        if(n==0){
            return 0;
        }
        int small=printNumber(n/10);
        return small+1;
    }

    public static void main(String[] args) {
        System.out.println(printNumber(123));

    }
}
