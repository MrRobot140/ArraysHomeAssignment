public class Duplicate {
    public static void main(String[] args) {

        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        boolean found = false;

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nDuplicate numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.print(numbers[i] + " ");
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}