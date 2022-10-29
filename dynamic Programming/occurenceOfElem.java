package dynamicprogramming;

public class occurenceOfElem {
    public static int first=-1;
    public static int second=-1;

    public static void firstAndLastOcc(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(second);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                second=idx;
            }
        }
        firstAndLastOcc(str,idx+1,element);
    }

    public static void main(String[] args) {
        String str="aaacbdubfeffubakn";
        char element='a';
        firstAndLastOcc(str,0,element);
    }

}
