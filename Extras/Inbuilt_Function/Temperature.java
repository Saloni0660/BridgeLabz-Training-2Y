import java.util.*;

public class Temperature {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Temperature Converter");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.print("Choose conversion (1 or 2): ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                double c = fahrenheitToCelsius(f);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", f, c);

            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                double f = celsiusToFahrenheit(c);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", c, f);

            } else {
                System.out.println("Invalid choice! Please run the program again.");
            }
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
