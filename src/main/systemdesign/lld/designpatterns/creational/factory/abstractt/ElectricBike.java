package main.systemdesign.lld.designpatterns.creational.factory.abstractt;

public class ElectricBike implements Bike {

    @Override
    public void ride() {
        System.out.println("Riding electric bike");
    }
}
