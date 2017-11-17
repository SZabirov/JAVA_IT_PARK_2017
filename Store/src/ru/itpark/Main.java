package ru.itpark;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      ProductsDAO dao = new ProductsDaoTxtImplementation();
//      System.out.println(dao.exist("сыр"));
//      System.out.println(dao.exist("молоко"));
      Product product = new Product("сыр", 140, "Молокозавод");
      dao.addProduct(product);
      product.getPrice();

      String s = "ab,ac,df";
      String[] arr = s.split(",");
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
    }
}
