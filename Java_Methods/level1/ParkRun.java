import java.util.Scanner;

public class ParkRun {

    // Method to calculate perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate number of rounds needed to complete 5 km
    public static int calculateRounds(double distance, double perimeter) {
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        System.out.println("Enter the 3 sides of the triangular park in meters:");

        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double distance = 5000; // 5 km in meters

        int rounds = calculateRounds(distance, perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        }
    }
}
