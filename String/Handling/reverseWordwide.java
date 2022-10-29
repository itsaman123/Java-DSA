package String.Handling;

public class reverseWordwide {
    public static void main(String[] args) {
    int x=1230;

        int rev=0;
        while(x!=0){
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                System.out.println("0");
            }
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        System.out.println(rev);

    }





    }





