package Summer_Training_2023;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class hashmapUserInput {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a key: ");
            String key = scanner.nextLine();
            System.out.print("Enter a value: ");
            int value = Integer.parseInt(scanner.nextLine());

            hashMap.put(key, value);
            System.out.println();
        }
        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}