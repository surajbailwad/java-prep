package main.systemdesign.lld.designpatterns.structural.adapter;

public class AdapterClient {


    public static void execute() {
        PaymentGateway paymentGateway = new PaymentAdapter(new LegacyPayment());
        paymentGateway.pay();
    }
}
