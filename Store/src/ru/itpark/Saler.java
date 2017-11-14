package ru.itpark;

import java.io.IOException;

public class Saler {
  ProductsDAO productsDAO;

  void sale(String productName) throws IOException {
    if (productsDAO.exist(productName)) {
      int price = productsDAO.getPrice(productName);
      System.out.println("С вас " + price + " рублей");
    }
  }
}
