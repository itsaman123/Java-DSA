package Summer_Training_2023;
public class decimaltoBinary {
    public static void main(String[] args) {
        int n=12;
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);

    }
}
