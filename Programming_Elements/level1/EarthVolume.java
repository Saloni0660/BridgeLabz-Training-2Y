public class EarthVolume {
    public static void main(String[] args) {
        // Given radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;

        // Formula for volume of a sphere: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMiles;

        // Calculate volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
