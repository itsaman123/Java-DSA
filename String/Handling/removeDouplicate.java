package String.Handling;

public class removeDouplicate {
    static void removConsDoub(String str){
        for(int i=0;i<str.length()+1;i++){
            if (str.charAt(i)==str.charAt(i+1)) {
                continue;
            }
            System.out.println(str.charAt(i));


        }

    }
    public static void main(String[]arg){
        String str="aabbcc";
        removConsDoub(str);
    }
}
