import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();

            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number2 != 0 ? number1 / number2 : Double.NaN;

            System.out.println("\n--- Results ---");
            System.out.println("Addition = " + addition);
            System.out.println("Subtraction = " + subtraction);
            System.out.println("Multiplication = " + multiplication);

            if (number2 != 0) {
                System.out.println("Division = " + division);
            } else {
                System.out.println("Division not possible (cannot divide by zero).");
            }
        }
    }
}