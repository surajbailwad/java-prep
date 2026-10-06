package main.systemdesign.lld.designpatterns.behavioural.cor;

public class CORClient {

    public static void executeCOR() {
        Manager manager = new Manager();
        Lead lead = new Lead();
        lead.setNextHandler(manager);
        lead.approve(2);
        lead.approve(3);
    }
}
