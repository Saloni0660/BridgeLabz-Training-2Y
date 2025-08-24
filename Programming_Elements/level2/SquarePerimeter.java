import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter side of square (in cm): ");
            double side = input.nextDouble();

            double perimeter = 4 * side;

            System.out.println("\n--- Result ---");
            System.out.println("Perimeter of square = " + perimeter + " cm");
        }
    }
}