package ru.itpark;


import java.io.IOException;

public interface ProductsDAO {
  boolean exist(String productName) throws IOException;

  void addProduct(Product product) throws IOException;

  int getPrice(String productName);
}
