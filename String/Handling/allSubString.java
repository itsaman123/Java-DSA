package String.Handling;

public class allSubString {
    public static void toPrintAllSubString(String str){
        for(int i=0;i<str.length();i++){   //start
            for(int j=i+1;j<=str.length();j++){   //end
                System.out.println(str.substring(i,j));

            }
        }
    }

    public static void main(String[] args) {
        String str="aman";
        toPrintAllSubString(str);


    }
}
