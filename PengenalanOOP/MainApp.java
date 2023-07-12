/*
 * MainApp.java
 * 
 * Created by : Farhan Nasrulloh
 * Created at 28/09/21, 20.00.00
 */

package PengenalanOOP;

public class MainApp {
  public static void main(String[] args) {
    Person person1 = new Person("Eko", "Tegal");
    person1.sayHello("Padepokan 79");
    System.out.println(person1.sayAddress());

    Person person2 = new Person();
    person2.name = "Joko";
    person2.address = "Surabaya";
    person2.sayHello("Padepokan 79");
    System.out.println(person2.sayAddress());

    Person person3 = new Person("Budi");
    person3.address = "Bandung";
    person3.sayHello("Padepokan 79");
  }
}
