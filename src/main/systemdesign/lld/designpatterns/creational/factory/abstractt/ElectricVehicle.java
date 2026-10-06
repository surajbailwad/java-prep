package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class ElectricVehicle implements VehicleFactory {

    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Bike createBike() {
        return new ElectricBike();
    }
}
