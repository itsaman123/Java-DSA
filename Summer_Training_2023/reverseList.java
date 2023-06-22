package Summer_Training_2023;
import java.util.Arrays;

public class reverseList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}



