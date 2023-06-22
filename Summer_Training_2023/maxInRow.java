package Summer_Training_2023;

public class maxInRow {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println("max is : "+max);
        }

    }
}

