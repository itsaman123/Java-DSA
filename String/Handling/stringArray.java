package String.Handling;

public class stringArray {
    public static void main(String[] args) {
        String s[]={"aman","maurya","avinash","Maurya","jyoti"};
//        int a=s.length;
        String value="Maury78a";
        boolean flag=false;
        for(String i:s){
            if(i.equals(value)){
                System.out.println("String found in array");
                flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("String not found");
        }
    }
}
