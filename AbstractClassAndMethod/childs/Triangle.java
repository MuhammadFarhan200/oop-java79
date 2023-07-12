package AbstractClassAndMethod.childs;

import AbstractClassAndMethod.parents.Shape;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle() {
    super();
  }

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double getArea() {
    double area = 0.5 * base * height;
    return area;
  }
}
