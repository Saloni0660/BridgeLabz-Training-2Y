import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of the cylinder: ");
            double radius = input.nextDouble();

            System.out.print("Enter height of the cylinder: ");
            double height = input.nextDouble();

            double volume = Math.PI * radius * radius * height;

            System.out.println("\n--- Result ---");
            System.out.println("Volume of Cylinder = " + volume);
        }
    }
}