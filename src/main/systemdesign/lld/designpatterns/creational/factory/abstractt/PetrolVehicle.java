package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class PetrolVehicle implements VehicleFactory {
    @Override
    public Car createCar() {
        return new PetrolCar();
    }

    @Override
    public Bike createBike() {
        return new PetrolBike();
    }
}
