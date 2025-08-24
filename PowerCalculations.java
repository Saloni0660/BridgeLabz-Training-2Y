import java.util.Scanner;

public class PowerCalculations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the base number: ");
            double base = input.nextDouble();

            System.out.print("Enter the exponent: ");
            double exponent = input.nextDouble();

            // Formula: base^exponent
            double result = Math.pow(base, exponent);

            System.out.println("\n--- Result ---");
            System.out.println(base + " raised to the power " + exponent + " = " + result);
        }
    }
}