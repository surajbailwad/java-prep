package main.systemdesign.lld.designpatterns.structural.decorator;

public class DecoratorClient {
    public static void execute() {
        Bike bike = new RideAssistDecorator(new CustomPaintDecorator(new BasicBike()));
        System.out.println(bike.getDescription() + " " + bike.getPrice());
    }
}
