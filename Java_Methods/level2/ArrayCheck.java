import java.util.Scanner;

public class ArrayCheck {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2
    // Returns 0 if number1 == number2
    // Returns -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through array and check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison between first and last element: ");
        if (comparisonResult == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[numbers.length - 1] + ").");
        }

        }
    }
}
