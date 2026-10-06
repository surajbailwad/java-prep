package main.systemdesign.lld.designpatterns.creational.factory.simple;

public class EmailNotification implements Notification{

    @Override
    public void alert() {
        System.out.println("Email Notification Alert");
    }
}
