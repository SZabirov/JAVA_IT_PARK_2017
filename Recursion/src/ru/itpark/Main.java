package ru.itpark;

public class Main {

  public static void main(String[] args) {
//    System.out.println(fact(5));
    printNumbers(5432);
  }

  static void printNumbers (int n) {
    if (n / 10 > 0) {
      int lastDigit = n % 10;
      System.out.println(lastDigit);
      printNumbers(n / 10);
    } else {
      System.out.println(n);
    }
  }





  static int fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * fact (n - 1);
    }
  }
}
