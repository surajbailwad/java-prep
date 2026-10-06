package main.systemdesign.lld.designpatterns.creational.singleton;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked INSTANCE;

    private SingletonDoubleChecked() {

    }

    public SingletonDoubleChecked getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleChecked();
                }
            }
        }
        return INSTANCE;
    }
}
