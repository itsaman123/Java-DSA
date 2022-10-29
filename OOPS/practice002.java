package OOPS;

public class practice002 {
    static int sumNatural(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumNatural(n-1);
        }

    }

    public static void main(String[] args) {
        int c=sumNatural(9);
        System.out.println(c);

    }
}
