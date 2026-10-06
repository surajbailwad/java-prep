package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class ShowRoom {
    private final Car car;
    private final Bike bike;

    public ShowRoom(VehicleFactory factory) {
        this.car = factory.createCar();
        this.bike = factory.createBike();

    }

    public void display() {
        car.drive();
        bike.ride();
    }

}
