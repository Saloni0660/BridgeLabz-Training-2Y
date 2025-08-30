import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10; // max array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0 && index < maxDigit) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number = number / 10;
        }

        // Find largest and second largest
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        
        if (secondLargest != -1) {
            System.out.println("Second Largest digit: " + secondLargest);
        } else {
            System.out.println("Second Largest digit: Not found (all digits same or only one digit)");
        }
        
        }
    }
}
