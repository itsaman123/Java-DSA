package Summer_Training_2023;

import Arrays.Selection;

public class insertionSort {
    static void Insert(int arr[], int n){
        for(int i=1;i<n;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && k<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,5,1,4,3};
        int n=arr.length;
        Insert(arr,n);
    }
}

