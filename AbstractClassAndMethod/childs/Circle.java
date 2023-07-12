package AbstractClassAndMethod.childs;

import AbstractClassAndMethod.parents.Shape;

public class Circle extends Shape {
  private double radius;

  public Circle() {
    super();
  }

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double value) {
    radius = value;
  }

  @Override
  public double getArea() {
    double area = Math.PI * radius * radius;
    return area;
  }
}
