package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class PetrolCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving petrol car");
    }
}
