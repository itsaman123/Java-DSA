package Summer_Training_2023;

public class evenoddsum {
    public static void main(String[] args) {
        String s="1234";
        char[] n=s.toCharArray();
//        int i=0;
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<n.length;i++){
            if(i%2==0){
                int newo=Character.getNumericValue(n[i]);
                evensum+=newo;
            }
            else if(i%2!=0){
                int newe=Character.getNumericValue(n[i]);
                oddsum+=newe;
            }

        }
        System.out.println("even: "+evensum);
        System.out.println("odd: "+oddsum);


    }
}
