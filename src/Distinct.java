public class Distinct {
    public static void main (String[] args) {
        int[] numbers = {2, 6, 7, 1488, 67,87, 12};
        int largest = 0, second = 0;

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        boolean foundSecond = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                second = largest;
                largest = numbers[i];
                foundSecond = true;
            }
            else if (numbers[i] < largest && (!foundSecond || numbers[i] > second)) {
                second = numbers[i];
                foundSecond = true;
            }
        }
        System.out.println("Largest: " + largest);
        if (foundSecond) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("Second largest does not exist");
        }
    }
}
