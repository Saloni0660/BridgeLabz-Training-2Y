import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Step 1: Take input
            System.out.print("Enter first number: ");
            double first = input.nextDouble();

            System.out.print("Enter second number: ");
            double second = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = input.next();

            double result;

            // Step 2: Switch case based on operator
            switch (op) {
                case "+" -> {
                    result = first + second;
                    System.out.println("Result: " + result);
                }

                case "-" -> {
                    result = first - second;
                    System.out.println("Result: " + result);
                }

                case "*" -> {
                    result = first * second;
                    System.out.println("Result: " + result);
                }

                case "/" -> {
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                }

                default -> System.out.println("Invalid Operator!");
            }
        }
    }
}
