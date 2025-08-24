import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Principal amount: ");
            double principal = input.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = input.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = input.nextDouble();

            // Formula: SI = (P * R * T) / 100
            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("\n--- Result ---");
            System.out.println("Simple Interest = " + simpleInterest);
        }
    }
}