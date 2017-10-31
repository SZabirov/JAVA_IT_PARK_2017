package ru.itpark;

import java.util.Scanner;

public class ChangeCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);
    if (x >= 'A' & x <= 'Z') {
      char c = (char) (x + 32);
      System.out.println(c);
    } else {
      char c = (char) (x - 32);
      System.out.println(c);
    }
  }
}
