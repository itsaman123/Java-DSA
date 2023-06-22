package Summer_Training_2023;
public class binarySearch {
    static void binaryS(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,6,8,4};
        int n=6;
        binaryS(arr,n);
    }
}

