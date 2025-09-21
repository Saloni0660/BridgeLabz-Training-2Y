import java.util.*;

public class VehicleRentalDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 1000, "CAR-INS-001"));
        vehicles.add(new Bike("B202", 300, "BIKE-INS-002"));
        vehicles.add(new Truck("T303", 2000, "TRUCK-INS-003"));

        int days = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " | Number: " + v.getVehicleNumber());
            System.out.println("Rental for " + days + " days: " + v.calculateRentalCost(days));
            System.out.println("Insurance Cost: " + ((Insurable) v).calculateInsurance());
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("----------------------------------");
        }
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String policyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.policyNumber = policyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    protected String getPolicyNumber() {
        return policyNumber;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getPolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) * 0.8;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getPolicyNumber();
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getPolicyNumber();
    }
}
