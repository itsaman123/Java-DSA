package Summer_Training_2023;

public class palindromeandReverse {
    public static void main(String[] args) {
        String input="madam";
        String revers=reversed(input);
        System.out.println("reverse is: "+revers);
        if(input.equalsIgnoreCase(revers)){
            System.out.println("yes, palindrome");
        }
        else{
            System.out.println("no");
        }
    }
    public static String reversed(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
