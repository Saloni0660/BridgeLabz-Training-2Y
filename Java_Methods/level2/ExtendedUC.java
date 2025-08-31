public class ExtendedUC{

    // 1. Yards to Feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // 2. Feet to Yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // 3. Meters to Inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // 4. Inches to Meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // 5. Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Main method for testing all conversions
    public static void main(String[] args) {
        double yards = 5;
        double feet = 15;
        double meters = 1;
        double inches = 10;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
    }
}
