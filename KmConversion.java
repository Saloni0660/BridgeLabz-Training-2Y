import java.util.Scanner;

public class KmConversion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers: ");
            double kilometers = input.nextDouble();

            // Formula: Miles = Kilometers * 0.621371
            double miles = kilometers * 0.621371;

            System.out.println("\n--- Result ---");
            System.out.println(kilometers + " kilometers = " + miles + " miles");
        }
    }
}