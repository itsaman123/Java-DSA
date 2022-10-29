package dynamicprogramming;

import java.util.ArrayList;

public class subSequence01 {
    public static void printSubsequence(int arr[], int index, ArrayList<Integer> path){
        if(index==arr.length){
            if(path.size()>0){
                System.out.println(path);
            }
        }
        else{
            printSubsequence(arr,index+1,path); //to include the index
            path.add(arr[index]);

            printSubsequence(arr,index+1,path); // to not include the index

            path.remove(path.size()-1);


        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        ArrayList path=new ArrayList<>();
        printSubsequence(arr,0,path);

    }
}
