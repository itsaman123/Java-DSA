package Summer_Training_2023;
import java.util.Scanner;

public class matrixInput01 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix you entered is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
