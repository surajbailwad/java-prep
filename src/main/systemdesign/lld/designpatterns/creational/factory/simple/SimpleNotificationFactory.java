package main.systemdesign.lld.designpatterns.creational.factory.simple;

public class SimpleNotificationFactory {

    public static Notification createNotification(String type) {
        switch (type.toUpperCase()) {
            case "SMS":
                return new SmsNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
