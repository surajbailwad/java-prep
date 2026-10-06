package main.systemdesign.lld.problems.parkinglot.vehicle;

public class Car extends Vehicle {
    protected Car(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }
}
