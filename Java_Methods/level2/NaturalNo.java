import java.util.Scanner;

public class NaturalNo {

    // Recursive method to calculate sum of first n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method to calculate sum of first n natural numbers
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("✅ Both results match.");
            } else {
                System.out.println("❌ The results do not match!");
            }
        }

        }
    }
}
