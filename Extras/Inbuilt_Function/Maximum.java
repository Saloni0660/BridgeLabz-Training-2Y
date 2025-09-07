import java.util.*;

public class Maximum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            int max;

            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }

            System.out.println("Maximum of the three numbers is: " + max);
        }
    }
}
