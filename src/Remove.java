import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nEnter index to remove: ");
        int index = sc.nextInt();

        if (index < 0 || index >= numbers.length) {
            System.out.println("\nInvalid index.");
        }
        else {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            System.out.print("\nUpdated:");
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}