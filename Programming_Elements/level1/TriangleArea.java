import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter base of triangle in cm: ");
            double base = input.nextDouble();

            System.out.print("Enter height of triangle in cm: ");
            double height = input.nextDouble();

            double area = 0.5 * base * height;
            System.out.println("Area of triangle = " + area + " square cm");
        }
    }
}