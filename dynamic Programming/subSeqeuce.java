package dynamicprogramming;

import java.util.HashSet;

public class subSeqeuce {
    public static void subsuq(String str,int idx, String newString, HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString))
                return;
            else
                System.out.print(newString+" ");
                set.add(newString);
                return;
        }
        char currChar=str.charAt(idx);
//        to be
        subsuq(str,idx+1,newString+currChar, set);
//        or not to be
        subsuq(str,idx+1,newString, set);
    }
    public static void main(String[] args) {
        String str="aab";
        HashSet<String> set=new HashSet<>();
        subsuq(str,0,"", set);


    }
}
