package ru.itpark;

public class SumElements {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i <= 125; i++) {
      sum = sum + i;
      System.out.println("i = " + i);
      System.out.println("sum = " + sum);
    }
  }
}
