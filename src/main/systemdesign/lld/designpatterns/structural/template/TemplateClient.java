package main.systemdesign.lld.designpatterns.structural.template;

public class TemplateClient {

    public static void exec() {
        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}
