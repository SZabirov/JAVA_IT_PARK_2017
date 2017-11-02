package ru.itpark.extra;

public class Main1 {
  public static void main(String[] args) {
    int x;
    x = 5;
    int ostatok = x % 2;
    if (ostatok == 0) {
      System.out.println("Четное");
    } else {
      System.out.println("Нечетное");
    }
  }
}
