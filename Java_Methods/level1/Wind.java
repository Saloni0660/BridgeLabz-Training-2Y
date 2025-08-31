import java.util.Scanner;

public class Wind {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature)
               + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        // Optional: basic validation
        if (windSpeed < 3 || temperature > 50) {
            System.out.println("Note: Wind chill is only valid for temperatures <= 50°F and wind speed >= 3 mph.");
        }

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);

        }
    }
}
