package ru.itpark.extra;

import java.util.Scanner;

//подается n чисел, выяснить, сколько из них больше 0
public class SequenceExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество элементов: ");
    int n;
    n = sc.nextInt();
    int positiveCount = 0;
    int negativeCount = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Введите след. число:");
      int x = sc.nextInt();
      if (x > 0) {
        positiveCount++;
      }
      if (x < 0) {
        negativeCount++;
      }
    }
    System.out.println("Кол-во чисел > 0:" + positiveCount);
    System.out.println("Кол-во чисел < 0:" + negativeCount);
  }
}
