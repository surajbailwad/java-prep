package main.systemdesign.lld.designpatterns.behavioural.statergy;

public class StrategyClient {
    private StrategyClient() {
    }


    public static void execute() {
        PaymentService paymentService = new PaymentService(new UPIPaymentStrategy());
        paymentService.pay();

        paymentService = new PaymentService(new CardPaymentStrategy());
        paymentService.pay();
    }
}
