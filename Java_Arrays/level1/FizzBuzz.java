import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Step 1: Take user input
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // Step 2: Create String array
            String[] results = new String[number + 1];

            // Step 3: Fill the array with FizzBuzz logic
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0 && i != 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0 && i != 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // Step 4: Print results
            System.out.println("\nFizzBuzz Results:");
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
    }
}
