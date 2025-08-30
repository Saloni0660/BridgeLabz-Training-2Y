import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] numbers = new double[10];  // Array of 10 doubles
            double total = 0.0;                 // Sum of numbers
            int index = 0;                      // Current index

            // Infinite loop for input
            while (true) {
                System.out.print("Enter a number (0 or negative to stop): ");
                double num = input.nextDouble();

                // Stop if user enters 0 or negative
                if (num <= 0) {
                    break;
                }

                // Stop if array is full
                if (index == numbers.length) {
                    System.out.println("Array is full. Stopping input.");
                    break;
                }

                // Store number in array and increase index
                numbers[index] = num;
                index++;
            }

            // Display all numbers and calculate sum
            System.out.println("\nNumbers entered:");
            for (int i = 0; i < index; i++) {
                System.out.println(numbers[i]);
                total += numbers[i];
            }

            // Display total
            System.out.println("\nTotal of all numbers = " + total);
        }
    }
}
