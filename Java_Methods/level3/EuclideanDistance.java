public class EuclideanDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) of the line passing through two points
    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) {
            throw new IllegalArgumentException("Slope is undefined for vertical line.");
        }
        return (y2 - y1) / (x2 - x1);
    }

    // Method to calculate the y-intercept (b) of the line given slope and one point
    public static double calculateYIntercept(double x1, double y1, double slope) {
        return y1 - slope * x1;
    }

    public static void main(String[] args) {
        // Example points
        double x1 = 2, y1 = 3;
        double x2 = 5, y2 = 7;

        try {
            double distance = calculateDistance(x1, y1, x2, y2);
            double slope = calculateSlope(x1, y1, x2, y2);
            double yIntercept = calculateYIntercept(x1, y1, slope);

            System.out.printf("Distance between points: %.4f%n", distance);
            System.out.printf("Equation of line: y = %.4fx + %.4f%n", slope, yIntercept);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
