package Encapsulation.childs;

import Encapsulation.parents.Person;

public class Programmer extends Person {
  private String technology;

  public Programmer() {
    super();
  }

  public Programmer(String name, String address, String technology) {
    super(name, address);
    this.technology = technology;
  }

  public void hacking() {
    System.out.println("I can hacking a website");
  }

  public void coding() {
    System.out.println("I can create a application using technology : " + technology + ".");
  }
  
  public void greeting() {
    super.greeting();
    System.out.println("My job is a " + technology + " programmer.");
  }

  public String getTechnology() {
    return this.technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }
}
