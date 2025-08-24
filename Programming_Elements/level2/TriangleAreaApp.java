import java.util.Scanner;

public class TriangleAreaApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter base of triangle (in cm): ");
            double base = input.nextDouble();

            System.out.print("Enter height of triangle (in cm): ");
            double height = input.nextDouble();

            // Area in cm²
            double areaCm = 0.5 * base * height;

            // Convert cm² to inch² (1 in = 2.54 cm → 1 in² = (2.54*2.54) cm² = 6.4516 cm²)
            double areaInch = areaCm / 6.4516;

            System.out.println("\n--- Results ---");
            System.out.println("Area of triangle = " + areaCm + " cm²");
            System.out.println("Area of triangle = " + areaInch + " in²");
        }
    }
}