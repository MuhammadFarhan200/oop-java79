public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person() {
        super();
    }

    Person(String paramName) {
        name = paramName;
    }

    Person(String paramName, String address) {
        this(paramName);
        this.address = address;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
    
    String sayAddress() {
        return "I come from " + address + ".";
    }
    
    void greeting() {
        System.out.println("Hello My name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }
}