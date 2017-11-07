package ru.itpark;

public class Fact {
  public static void main(String[] args) {
//    System.out.println(5!);
//    System.out.println(10!);
//    System.out.println(4!);
    int n1 = fact(5);
    int n2 = fact(10);
    int n3 = fact(4);
    System.out.println(n1 + n2 + n3);
  }

  static int fact(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }
}
