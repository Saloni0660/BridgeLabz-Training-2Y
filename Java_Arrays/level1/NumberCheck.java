import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[5];

            // Take input for 5 numbers
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            System.out.println("\nNumber Classification:");

            // Check each number
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];

                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.println(num + " is Positive and Even.");
                    } else {
                        System.out.println(num + " is Positive and Odd.");
                    }
                } else if (num < 0) {
                    System.out.println(num + " is Negative.");
                } else {
                    System.out.println(num + " is Zero.");
                }
            }

            // Compare first and last element
            System.out.println("\nComparison of First and Last Element:");
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            if (first == last) {
                System.out.println("First element (" + first + ") is equal to Last element (" + last + ")");
            } else if (first > last) {
                System.out.println("First element (" + first + ") is greater than Last element (" + last + ")");
            } else {
                System.out.println("First element (" + first + ") is less than Last element (" + last + ")");
            }
        }
    }
}
