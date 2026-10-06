package main.systemdesign.lld.designpatterns.structural.template;

public abstract class Beverage {

    public void prepare() {
        boilWater();
        brew();
        pour();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pour() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();
}
