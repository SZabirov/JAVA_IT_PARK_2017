package ru.itpark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductsDaoCsvImplementation implements ProductsDAO {
  @Override
  public boolean exist(String productName) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("products.csv"));
    String s;
    while ((s = br.readLine()) != null) {
      String[] arr = s.split(", ");
      if (arr[0].equals(productName)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void addProduct(Product product) {

  }

  @Override
  public int getPrice(String productName) {
    return 0;
  }
}
