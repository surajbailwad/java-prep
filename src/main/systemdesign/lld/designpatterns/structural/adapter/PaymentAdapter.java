package main.systemdesign.lld.designpatterns.structural.adapter;

public class PaymentAdapter implements PaymentGateway {

    private LegacyPayment legacyPayment;

    public PaymentAdapter(LegacyPayment legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public void pay() {
        legacyPayment.makePayment();
    }
}
