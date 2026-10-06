package main.systemdesign.lld.designpatterns.creational.prototype;

public class Employee implements Cloneable {

    public String name;
    public int age;
    public Address address;

    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            clone.address = address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
