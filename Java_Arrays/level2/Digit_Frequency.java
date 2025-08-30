import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Step 1: Take number input
            System.out.print("Enter a number: ");
            long number = input.nextLong();

            // Step 2: Convert number to digits array
            String numStr = Long.toString(number);
            int[] digits = new int[numStr.length()];

            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = numStr.charAt(i) - '0';  // Convert char → int
            }

            // Step 3: Create frequency array
            int[] frequency = new int[10]; // 0-9 digits

            // Step 4: Count frequency of each digit
            for (int digit : digits) {
                frequency[digit]++;
            }

            // Step 5: Display results
            System.out.println("\n--- Digit Frequency ---");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
                }
            }
        }
    }
}
