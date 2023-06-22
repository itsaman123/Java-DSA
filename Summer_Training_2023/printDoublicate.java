package Summer_Training_2023;

public class printDoublicate {
    public static void main(String[] args) {
        int arr[]={1,1,1,3,4,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
