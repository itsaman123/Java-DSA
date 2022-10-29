package String.Handling;

public class strPrefix {
    public static void prefixPrint(String str){
        String s=null;
        for(int i=0;i<str.length();i++){

            System.out.println(str.substring(0,i+1));
//            System.out.println(str.substring(1,i+1));

        }
    }

    public static void main(String[] args) {
        String str="abc";
        prefixPrint(str);
    }
}
