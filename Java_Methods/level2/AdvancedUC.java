public class AdvancedUC {

    // 1. Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 2. Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 3. Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // 4. Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // 5. Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // 6. Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Temperature
        System.out.println("100°F = " + convertFahrenheitToCelsius(100) + "°C");
        System.out.println("37.78°C = " + convertCelsiusToFahrenheit(37.78) + "°F");

        // Weight
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("68 kg = " + convertKilogramsToPounds(68) + " pounds");

        // Volume
        System.out.println("2 gallons = " + convertGallonsToLiters(2) + " liters");
        System.out.println("7.5 liters = " + convertLitersToGallons(7.5) + " gallons");
    }
}
