package main.systemdesign.lld.designpatterns.behavioural.statergy;

public class PaymentService {
    PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        strategy.pay();
    }
}