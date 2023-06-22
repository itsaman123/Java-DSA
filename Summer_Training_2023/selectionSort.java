package Summer_Training_2023;

public class selectionSort {
    static void Select(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minind];
            arr[minind]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,7,4,2};
        int n=arr.length;
        Select(arr,n);

    }
}
