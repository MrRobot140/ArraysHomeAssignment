public class Replace {
    public static void main (String[] args) {

        int replacements = 0;
        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 67, 9, -2};

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                numbers[i] = 0;
                replacements++;
            }
        }
        System.out.print("\nModified: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nReplacements: " + replacements);
    }
}