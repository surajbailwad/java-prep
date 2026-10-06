package main.systemdesign.lld.designpatterns.behavioural.observer;

public class ObserverClient {

    public static void execute() {

        OrderService orderService = new OrderService();
        orderService.addObserver(new SMSNotificationObserver());
        orderService.addObserver(new EmailNotificationObserver());

        orderService.placeOrder();

    }
}
