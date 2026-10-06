package main.systemdesign.lld.designpatterns.creational.factory.simple;

public class SmsNotification implements Notification {

    @Override
    public void alert() {
        System.out.println("Sms Notification Alert");
    }
}
