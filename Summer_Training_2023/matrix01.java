package Summer_Training_2023;

public class matrix01 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        arr[2][2]=0;

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum=sum+arr[j][i];


            }
            System.out.println();
            System.out.println("sum is : "+sum);

        }
    }
}
