package ru.itpark;

import java.util.Scanner;

public class AvgHeight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во эл-тов в массиве");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Вводите элементы с новой строки:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    double avg = (double) sum/n;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > avg) {
        count++;
      }
    }
    System.out.println("Средний рост: " + avg);
    System.out.println(count);
  }
}
