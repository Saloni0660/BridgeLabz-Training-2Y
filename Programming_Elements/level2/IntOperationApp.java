import java.util.Scanner;

public class IntOperationApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter value of a: ");
            int a = input.nextInt();

            System.out.print("Enter value of b: ");
            int b = input.nextInt();

            System.out.print("Enter value of c: ");
            int c = input.nextInt();

            // Perform operations
            int result1 = a + b * c;
            int result2 = a * b + c;
            int result3 = c + a / b;
            int result4 = a % b + c;

            // Display results
            System.out.println("\n--- Results of Integer Operations ---");
            System.out.println("a + b * c = " + result1);
            System.out.println("a * b + c = " + result2);
            System.out.println("c + a / b = " + result3);
            System.out.println("a % b + c = " + result4);
        }
    }
}