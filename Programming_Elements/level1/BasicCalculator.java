import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;

        // try-with-resources (Scanner auto close ho jayega)
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            number1 = input.nextDouble();

            System.out.print("Enter second number: ");
            number2 = input.nextDouble();

            // Perform arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = (number2 != 0) ? number1 / number2 : Double.NaN;

            // Print results
            System.out.println("The results are:");
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
        }
    }
}