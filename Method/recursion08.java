package Method;

public class recursion08 {
    static int firstIndex(int arr[],int x,int findex){
        if(findex==arr.length){
            return -1;
        }if(arr[findex]==x){
            return findex;

        }
        return firstIndex(arr,x,findex+1);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int findex=arr[0];
        int x=30;
        System.out.println(firstIndex(arr,x,0));

    }
}
