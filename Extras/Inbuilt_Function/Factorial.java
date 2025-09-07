import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = getInput(sc);
            long fact = factorial(num);
            displayResult(num, fact);
        }
    }

    public static int getInput(Scanner sc) {
        System.out.print("Enter a non-negative integer: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void displayResult(int num, long fact) {
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
