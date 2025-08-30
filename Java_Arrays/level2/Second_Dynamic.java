import java.util.Scanner;

public class Second_Dynamic {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            

        System.out.print("Enter a number: ");
        long number = input.nextLong();   // use long to handle big numbers

        int maxDigit = 19;  // initial capacity
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number > 0) {
            if (index == digits.length) { 
                // expand array by +10 when full
                int[] temp = new int[digits.length + 10];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        int[] validDigits = new int[index];
        for (int i = 0; i < index; i++) {
            validDigits[i] = digits[i];
        }

        // Find largest and second largest digit
        int largest = -1, secondLargest = -1;
        for (int d : validDigits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.print("Digits stored in array: ");
        for (int d : validDigits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: Not found (all digits same or only one digit)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        }
    }
}