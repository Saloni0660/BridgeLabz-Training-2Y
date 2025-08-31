import java.util.Scanner;

public class Trigonometry {

    // Method to calculate sin, cos, and tan of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert to radians
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] { sin, cos, tan };
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°): %.4f\n", angle, result[0]);
        System.out.printf("Cosine(%.2f°): %.4f\n", angle, result[1]);
        System.out.printf("Tangent(%.2f°): %.4f\n", angle, result[2]);

        }
    }
}
