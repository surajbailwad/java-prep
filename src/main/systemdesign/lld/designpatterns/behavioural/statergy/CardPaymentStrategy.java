package main.systemdesign.lld.designpatterns.behavioural.statergy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Card payment");
    }
}
