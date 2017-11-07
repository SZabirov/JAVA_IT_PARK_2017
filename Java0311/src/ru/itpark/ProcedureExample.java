package ru.itpark;

public class ProcedureExample {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    sum(a, b);
    sum(5, 45);
    sum(4, 45);
  }

  static void sum(int x, int y) {
    int s = x + y;
    System.out.println(s);
  }
}
