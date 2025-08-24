import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of the rectangle: ");
            double length = input.nextDouble();

            System.out.print("Enter width of the rectangle: ");
            double width = input.nextDouble();

            // Formula: Perimeter = 2 * (length + width)
            double perimeter = 2 * (length + width);

            System.out.println("\n--- Result ---");
            System.out.println("Perimeter of Rectangle = " + perimeter);
        }
    }
}