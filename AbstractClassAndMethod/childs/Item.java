package AbstractClassAndMethod.childs;

import AbstractClassAndMethod.parents.Product;

public class Item extends Product {
  private int price;

  public Item() {
    super();
  }

  public Item(String name, int price) {
    super(name);
    this.price = price;
  }

  @Override
  public void printInformation() {
    System.out.println("Product Name : " + getName());
    System.out.println("Product Price : " + price);
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int value) {
    price = value;
  }
}
