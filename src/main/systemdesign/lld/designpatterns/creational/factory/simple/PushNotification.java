package main.systemdesign.lld.designpatterns.creational.factory.simple;

public class PushNotification implements Notification {
    @Override
    public void alert() {
        System.out.println("Push notification alert");
    }
}
