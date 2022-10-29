package OOPS;

public class practice001 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
//            System.out.format("%d X %d = %d\n",n,i,n*i);
            int s=n*i;
            System.out.println(n+" X "+i+" ="+s);
        }
    }
    public static void main(String[] args) {
        multiplication(7);

    }
}
