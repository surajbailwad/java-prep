package main.systemdesign.lld.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notifyObservers();
    }

    public void notifyObservers() {
        observers.forEach(NotificationObserver::notifyMessage);
    }

}
