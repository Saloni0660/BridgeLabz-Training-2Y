import java.util.Scanner;

public class Chocolate {

    // Method to compute quotient and remainder
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int quotient = numberOfChocolates / numberOfChildren;
        int remainder = numberOfChocolates % numberOfChildren;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }
        
        }
    }
}
