import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter third number: ");
            double num3 = input.nextDouble();

            // Formula: Average = (num1 + num2 + num3) / 3
            double average = (num1 + num2 + num3) / 3;

            System.out.println("\n--- Result ---");
            System.out.println("Average of the three numbers = " + average);
        }
    }
}