package ru.itpark;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductsDaoTxtImplementation implements ProductsDAO {
  @Override
  public boolean exist(String productName) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("products.txt"));
    String s;
    while ((s = br.readLine()) != null) {
      if (s.equals(productName)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void addProduct(String productName) {

  }

  @Override
  public int getPrice(String productName) {
    return 0;
  }
}
