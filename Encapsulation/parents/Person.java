package Encapsulation.parents;

public class Person {
    private String name;
    private String address;
    final String country = "Indonesia";

    public Person() {
        super();
    }

    public Person(String paramName) {
        name = paramName;
    }

    public Person(String paramName, String address) {
        this(paramName);
        this.address = address;
    }
    
    public void greeting() {
        System.out.println("Hello My name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}