import java.util.Scanner;

public class Abundant{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int sum = 0;

            // Step 2: Find sum of divisors (excluding the number itself)
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;  // add divisor
                }
            }

            // Step 3: Check if sum > number
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is Not an Abundant Number.");
            }
        }
    }
}
