package ru.itpark;

public class Power {
  public static void main(String[] args) {
    int x = 5;
    int power = 6;
    int n = 1;
    for (int i = 0; i < power; i++) {
      n = n * x;
//      System.out.print("i = " + i);
//      System.out.println("  n = " + n);
    }
    System.out.println(n);
  }
}
