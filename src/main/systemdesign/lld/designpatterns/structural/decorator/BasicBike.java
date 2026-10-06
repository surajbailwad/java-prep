package main.systemdesign.lld.designpatterns.structural.decorator;

public class BasicBike implements Bike {
    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getDescription() {
        return "100cc Bike";
    }
}
