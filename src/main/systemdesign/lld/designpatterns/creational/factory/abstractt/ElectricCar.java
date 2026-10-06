package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving electric car");
    }
}
