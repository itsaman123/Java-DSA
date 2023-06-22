package Summer_Training_2023;

public class sumOfTwoMatrix {
    public static void main(String[] args) {
        int arr1[][]={{1,2},
                      {3,4}};
        int arr2[][]={{5,6},
                      {7,8}};

        int res[][]=new int[2][2];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++) {
                res[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
