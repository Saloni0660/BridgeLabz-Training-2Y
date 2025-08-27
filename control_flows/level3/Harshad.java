import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int originalNumber = number;
            int sum = 0;

            // Step 2: Find sum of digits
            while (number > 0) {
                int digit = number % 10;  // get last digit
                sum += digit;             // add digit to sum
                number /= 10;             // remove last digit
            }

            // Step 3: Check divisibility
            if (originalNumber % sum == 0) {
                System.out.println(originalNumber + " is a Harshad Number.");
            } else {
                System.out.println(originalNumber + " is Not a Harshad Number.");
            }
        }
    }
}
