package Summer_Training_2023;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        int res[][]=new int[2][2];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i][j]=arr[j][i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
