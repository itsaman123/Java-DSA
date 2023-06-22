package Summer_Training_2023;

import java.util.Arrays;


public class secondmaxAndsecondmin {
    public static void findSecondMinMax(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        int secondMinimum = -1;
        int secondMaximum = -1;
        for (int i = 0; i < n - 1; i++) {               //1,2,3,4,5;
            if (numbers[i] != numbers[i + 1]) {
                secondMinimum = numbers[i + 1];
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (numbers[i] != numbers[i - 1]) {
                secondMaximum = numbers[i - 1];
                break;
            }
        }
        System.out.println("Second Minimum: " + secondMinimum);
        System.out.println("Second Maximum: " + secondMaximum);
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 2, 9, 1, 5, 10, 8,10,2,1};
        findSecondMinMax(numbers);
    }
}
