package AccessModifier.childs;

import AccessModifier.parents.Person;

public class Teacher extends Person {
 public String subject;

 public Teacher() {
   super();
  }

  public Teacher(String name, String address, String subject) {
    super(name, address);
    this.subject = subject;
  }
 
  public void teaching() {
    System.out.println("I can teach " + subject + ", so anyone how wants to learn can talk to me.");
  } 

  public void greeting() {
    System.out.println("Hello My name is " + name + ".");
    System.out.println("I come from " + address + ".");
    System.out.println("My job is a " + subject + " teacher.");
  }
}
