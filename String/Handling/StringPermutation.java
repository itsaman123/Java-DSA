package String.Handling;
import java.util.Arrays;
public class StringPermutation {
    public boolean checkPermut(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int freq[]=new int[256];
        for(int i=0;i<256;i++){
            freq[i]=0;
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch]--;

        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            freq[ch]--;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="aman";
        String s2="mana";
//        System.out.println(checkPermut(s1,s2));

    }
}
