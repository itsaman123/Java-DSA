package Method;

public class recursion07 {
    static int Arraysum(int arr[],int findex){
        if(findex==arr.length){
            return 0;
        }
        return arr[findex] + Arraysum(arr,findex+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arraysum(arr,0));

    }
}
