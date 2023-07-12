package Encapsulation;

import Encapsulation.childs.Doctor;
import Encapsulation.childs.Programmer;
import Encapsulation.childs.Teacher;
import Encapsulation.parents.Person;

public class MainApp {
  public static void main(String[] args) {
    Person person1 = new Programmer("Rizky", "Bandug", ".Net Core");
    Person person2 = new Teacher("Joko", "Tegal", "Matematika");
    Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");
    Person person4 = new Person();
    person4.setName("Budi");
    person4.setAddress("Jakarta");

    System.out.println(((Programmer)person1).getTechnology());

    sayHello(person1);
    sayHello(person2);
    sayHello(person3);
  }

  public static void sayHello(Person person) {
    String message;

    if (person instanceof Programmer) {
      Programmer programmer = (Programmer)person;
      message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
    } else if (person instanceof Teacher) {
      Teacher teacher = (Teacher)person;
      message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
    } else if (person instanceof Doctor) {
      Doctor doctor = (Doctor)person;
      message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
    } else {
      message = "Hello, " + person.getName() + ".";
    }
    
    System.out.println(message);
  }
}
