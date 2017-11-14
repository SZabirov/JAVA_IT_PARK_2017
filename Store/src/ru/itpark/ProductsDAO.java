package ru.itpark;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductsDAO {
  boolean exist(String productName) throws IOException;

  void addProduct(String productName);

  int getPrice(String productName);
}
