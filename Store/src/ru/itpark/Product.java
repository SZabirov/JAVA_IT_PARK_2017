package ru.itpark;

public class Product {
  private String name;
  private int price;
  private String factory;

  public Product(String name, int price, String factory) {
    this.name = name;
    this.price = price;
    this.factory = factory;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getFactory() {
    return factory;
  }
}
