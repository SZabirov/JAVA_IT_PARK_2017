package ru.itpark;

import java.util.Scanner;

public class IfExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if (x > 10) {
      System.out.println("Число больше 10");
    } else {
      System.out.println("Число меньше либо равно 10");
    }
  }
}
