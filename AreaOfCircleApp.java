import java.util.Scanner;

public class AreaOfCircleApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of circle: ");
            double radius = input.nextDouble();

            double area = Math.PI * radius * radius;

            System.out.println("\n--- Result ---");
            System.out.println("Area of circle: " + area);
        }
    }
}