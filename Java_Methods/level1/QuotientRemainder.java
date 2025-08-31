import java.util.Scanner;

public class QuotientRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }

        }
    }
}
