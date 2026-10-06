package main.systemdesign.lld.designpatterns.structural.decorator;

public class CustomPaintDecorator extends BikeDecorator {

    public CustomPaintDecorator(Bike bike) {
        super(bike);
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 100;
    }

    @Override
    public String getDescription() {
        return bike.getDescription()
                + ", custom paint";
    }
}
