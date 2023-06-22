package Summer_Training_2023;

public class maxandmin {
    public static void main(String[] args) {
        int n=1432;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(n!=0){
            int mod=n%10;
            if(n>max){
                max=mod;
            }
            else{
                min=mod;
            }
            n/=10;
        }
        System.out.println(max+" "+min);
    }
}
