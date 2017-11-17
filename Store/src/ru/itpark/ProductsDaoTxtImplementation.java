package ru.itpark;

import java.io.*;

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
  public void addProduct(Product product) throws IOException {
    BufferedWriter br = new BufferedWriter(new FileWriter("products.txt", true));
    br.newLine();
    br.write(product.getName());
    br.flush();
  }

  @Override
  public int getPrice(String productName) {
    return 0;
  }

  private int size() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("products.txt"));
    int count = 0;
    while (br.readLine() != null) {
      count++;
    }
    return count;
  }
}
