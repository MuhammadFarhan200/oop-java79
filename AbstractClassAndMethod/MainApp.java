package AbstractClassAndMethod;

import AbstractClassAndMethod.childs.Circle;
import AbstractClassAndMethod.childs.Triangle;
import AbstractClassAndMethod.parents.Shape;

public class MainApp {
  public static void main(String[] args) {
    Shape lingkaran = new Circle("Biru", 20);
    Shape segitiga = new Triangle("Merah", 10, 15);

    System.out.println("Luas Lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
    System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
  }
}
