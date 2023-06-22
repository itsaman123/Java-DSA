package Summer_Training_2023;

public class binary_Search {
    static int binary(int arr[],int l,int r,int k){
        while(l<=r){
            int m=l+(r-l)/2;
            if(k==arr[m]){
                return m;
            }
            else if(k>arr[m]){
                l=m+1;
            }
            else if(k<arr[m]){
                r=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,4,7,8};
        int k=4;
        System.out.println(k+" is present at index : "+binary(arr,0,arr.length-1,k));
    }
}
