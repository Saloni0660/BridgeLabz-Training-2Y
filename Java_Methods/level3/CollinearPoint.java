import java.util.Scanner;

public class CollinearPoint{

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes (avoid division by zero by cross-multiplying)
        int slopeAB_num = (y2 - y1);
        int slopeAB_den = (x2 - x1);
        int slopeBC_num = (y3 - y2);
        int slopeBC_den = (x3 - x2);
        int slopeAC_num = (y3 - y1);
        int slopeAC_den = (x3 - x1);

        // Two slopes are equal if their cross products are equal:
        // slopeAB = slopeBC if slopeAB_num * slopeBC_den == slopeBC_num * slopeAB_den
        // similarly for other pairs
        boolean condition1 = slopeAB_num * slopeBC_den == slopeBC_num * slopeAB_den;
        boolean condition2 = slopeAB_num * slopeAC_den == slopeAC_num * slopeAB_den;

        return condition1 && condition2;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + 
                             x2 * (y3 - y1) + 
                             x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        if (collinearSlope) {
            System.out.println("Points are collinear by slope formula.");
        } else {
            System.out.println("Points are NOT collinear by slope formula.");
        }

        if (collinearArea) {
            System.out.println("Points are collinear by area formula.");
        } else {
            System.out.println("Points are NOT collinear by area formula.");
        }

        }
    }
}
