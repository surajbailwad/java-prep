package main.systemdesign.lld.designpatterns.structural.decorator;

public class RideAssistDecorator extends BikeDecorator {

    public RideAssistDecorator(Bike bike) {
        super(bike);
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 250;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", ride assist";
    }
}
