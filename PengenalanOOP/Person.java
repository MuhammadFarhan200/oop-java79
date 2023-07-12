package PengenalanOOP;

public class Person {
  String name;
  String address;
  final String country = "Indonesia";

  public Person() {
   super();
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, String address) {
    this(name);
    this.address = address;
  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ", my name is " + this.name);
  }

  String sayAddress() {
    return "I come from " + this.address + ".";
  } 
}
