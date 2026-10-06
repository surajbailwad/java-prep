package main.systemdesign.lld.designpatterns.behavioural.observer;

public class EmailNotificationObserver implements NotificationObserver {
    @Override
    public void notifyMessage() {
        System.out.println("Order notified via Email");
    }
}
