public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");

        System.out.println(ev.model + " (Max Speed: " + ev.maxSpeed + " km/h)");
        ev.charge();

        System.out.println();

        System.out.println(pv.model + " (Max Speed: " + pv.maxSpeed + " km/h)");
        pv.refuel();
    }
}

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass: Electric Vehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging the battery.");
    }
}

// Subclass: Petrol Vehicle implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}
