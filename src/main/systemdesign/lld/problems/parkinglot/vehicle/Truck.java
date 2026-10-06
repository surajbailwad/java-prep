package main.systemdesign.lld.problems.parkinglot.vehicle;

public class Truck extends Vehicle{
    protected Truck(String licenseNumber) {
        super(licenseNumber, VehicleType.TRUCK);
    }
}
