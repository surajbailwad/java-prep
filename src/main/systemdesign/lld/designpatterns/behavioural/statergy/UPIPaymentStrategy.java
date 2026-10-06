package main.systemdesign.lld.designpatterns.behavioural.statergy;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}
