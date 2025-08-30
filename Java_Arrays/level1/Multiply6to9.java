import java.util.Scanner;

public class Multiply6to9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Step 1: Take user input
            System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
            int number = input.nextInt();

            // Step 2: Define array of size 4 (for 6, 7, 8, 9)
            int[] multiplicationResult = new int[4];

            // Step 3: Generate multiplication table from 6 to 9
            for (int i = 6; i <= 9; i++) {
                multiplicationResult[i - 6] = number * i; // store result
            }

            // Step 4: Display results
            System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            }
        }
    }
}
