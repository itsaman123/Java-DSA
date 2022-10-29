package String.Handling;

public class palindrome01
{
    public static boolean checkPal(String input){
        int i=0;
        int j=input.length()-1;
        while(i<j){
            if(input.charAt(i)!=input.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input="A man, a plan, a canal: Panama";
        System.out.println(checkPal(input));
    }
}
