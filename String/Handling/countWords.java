package String.Handling;

public class countWords {
    static int countW(String str){
        if(str.length()==0){
            return 0;
        }
        int space=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='\n'){


                space++;
            }
        }
        space++;
        return space;
    }
    public static void main(String[] args) {

        String str="aman maurya is the boss";

        System.out.println(countW(str));

    }
}
