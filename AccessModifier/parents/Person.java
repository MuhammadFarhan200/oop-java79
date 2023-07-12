package AccessModifier.parents;

public class Person {
    public String name;
    public String address;
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

    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
    
    public String sayAddress() {
        return "I come from " + address + ".";
    }
    
    public void greeting() {
        System.out.println("Hello My name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }
}