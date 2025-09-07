import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();

            System.out.println("Fibonacci sequence up to " + n + " terms:");
            generateFibonacci(n);
        }
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
}
