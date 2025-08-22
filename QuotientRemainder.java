import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter second number: ");
            int number2 = input.nextInt();

            int quotient = number1 / number2;   // division
            int remainder = number1 % number2;  // modulus

            System.out.println("\n--- Result ---");
            System.out.println("Quotient of " + number1 + " and " + number2 + " is " + quotient);
            System.out.println("Remainder of " + number1 + " and " + number2 + " is " + remainder);
        }
    }
}