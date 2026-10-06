package main.systemdesign.lld.designpatterns.creational.singleton;

public enum SingletonEnum {
    INSTANCE;

    private String name;

    public void setName(String name) {
        INSTANCE.name = name;
    }

    public void printName() {
        System.out.println(INSTANCE.name);
    }
}
