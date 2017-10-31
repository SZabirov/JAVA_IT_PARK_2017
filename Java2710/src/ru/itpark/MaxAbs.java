package ru.itpark;

import java.util.Scanner;

public class MaxAbs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите кол-во чисел: ");
    int n = sc.nextInt();
    int max = 0;
    int number;
    for (int i = 0; i < n; i++) {
      number = sc.nextInt();
      int absValue = Math.abs(number);
      if (absValue > max){
        max = absValue;
      }
    }
    System.out.println("Максимум: " + max);
  }
}
