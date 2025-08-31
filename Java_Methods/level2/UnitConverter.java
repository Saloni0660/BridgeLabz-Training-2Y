public class UnitConverter {

    // 1. Kilometers to Miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // 2. Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // 3. Meters to Feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // 4. Feet to Meters
    public static double convertFeetToMeters(double feet) {
        return feet / 3.28084;
    }

    // Optional: Test all methods in main
    public static void main(String[] args) {
        double km = 5;
        double miles = 3.1;
        double meters = 10;
        double feet = 32.8;

        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
