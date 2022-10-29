package Method;

public class recursion04 {
    public static void printNumber(int n){
        if(n==1) {
            System.out.print(n + " ");
            return;
        }
//        return (n-1);
        printNumber(n-1);
        System.out.print(n+" ");
//
////            System.out.println(n);
//
//        }










//    static void printArray(int n){
//        int s=0;
//        for(int i=1;i<=n;i++){
////            s=i+1;
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) {
//        int n=5;
//        System.out.println(printNumber(n));
//        printArray(n);
        printNumber(5);

    }
}
