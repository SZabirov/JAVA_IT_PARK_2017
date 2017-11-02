package ru.itpark.extra;

import java.util.Scanner;

public class ReverseSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите n:");
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }
}
