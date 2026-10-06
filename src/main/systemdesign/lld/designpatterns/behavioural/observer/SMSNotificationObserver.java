package main.systemdesign.lld.designpatterns.behavioural.observer;

public class SMSNotificationObserver implements NotificationObserver {
    @Override
    public void notifyMessage() {
        System.out.println("Order notified via SMS");
    }
}
