package main.systemdesign.lld.designpatterns.structural.decorator;

abstract class BikeDecorator implements Bike {
    protected Bike bike;

    public BikeDecorator(Bike bike) {
        this.bike = bike;
    }
}
