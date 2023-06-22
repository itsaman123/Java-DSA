package Summer_Training_2023;

public class linearSearch {
    static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,7,2,5,9,5,6,7};
        int key=6;
        System.out.println(key+" is present at index: "+search(arr,key));
    }
}
