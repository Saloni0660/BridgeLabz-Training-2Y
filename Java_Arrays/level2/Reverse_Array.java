import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // Step 1: Take user input
            System.out.print("Enter a number: ");
            long number = input.nextLong();

            // Step 2: Count digits
            long temp = number;
            int count = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }

            // Step 3: Store digits in an array
            int[] digits = new int[count];
            temp = number;
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = (int)(temp % 10);
                temp /= 10;
            }

            // Step 4: Create reverse array
            int[] reverse = new int[count];
            for (int i = 0; i < count; i++) {
                reverse[i] = digits[count - 1 - i];
            }

            // Step 5: Display reversed number
            System.out.println("\nOriginal Digits:");
            for (int d : digits) {
                System.out.print(d + " ");
            }

            System.out.println("\nReversed Digits:");
            for (int d : reverse) {
                System.out.print(d + " ");
            }

            // Show as actual reversed number
            System.out.print("\nReversed Number: ");
            for (int d : reverse) {
                System.out.print(d);
            }
        }
    }
}
