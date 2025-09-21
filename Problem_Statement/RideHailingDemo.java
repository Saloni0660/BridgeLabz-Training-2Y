interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = location;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setRatePerKm(double rate) {
        if (rate > 0) {
            this.ratePerKm = rate;
        }
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getLocation() {
        return location;
    }

    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + " | Driver: " + driverName + 
                           " | Rate/km: " + ratePerKm + " | Location: " + location);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

public class RideHailingDemo {
    public static void processRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + v.calculateFare(distance));
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C101", "Alice", 15, "Downtown");
        Vehicle bike = new Bike("B202", "Bob", 10, "City Center");
        Vehicle auto = new Auto("A303", "Charlie", 12, "Station");

        processRide(car, 10);
        processRide(bike, 8);
        processRide(auto, 12);

        ((GPS) car).updateLocation("Airport");
        System.out.println("Car new location: " + ((GPS) car).getCurrentLocation());
    }
}
