package ru.itpark;

public class Main {

  public static void main(String[] args) {
//    System.out.println(fact(5));
//    printNumbers(52);
      printFromNToOne(12);
  }

  static void printNumbers (int n) {
    if (n < 10) {
      System.out.println(n);
    } else {
      int lastDigit = n % 10;
      printNumbers(n / 10);
      System.out.println(lastDigit);
    }
  }

  static void printFromNToOne(int n) {
    if (n == 1) {
      System.out.println(1);
    } else {
      System.out.println(n);
      printFromNToOne(n - 1);
    }
  }





  static int fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * fact (n - 1);
    }
  }

  static int sumOfDigits (int n) {
    if (n < 10) {
      return (n);
    } else {
      int lastDigit = n % 10;
      return sumOfDigits(n / 10) + lastDigit;
    }
  }












}
