package main.systemdesign.lld.designpatterns.creational.prototype;

public class Address implements Cloneable {
    public String city;
    public int pin;

    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
