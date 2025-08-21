import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter perimeter of square (in cm): ");
            double perimeter = input.nextDouble();

            double side = perimeter / 4;

            System.out.println("\n--- Result ---");
            System.out.println("Side of square = " + side + " cm");
        }
    }
}