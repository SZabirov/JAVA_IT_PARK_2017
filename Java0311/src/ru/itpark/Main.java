package ru.itpark;

import java.util.Scanner;

public class Main {

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
//      for (int i = 0; i < n; i++) {
//        if ((i % 2) == 1)
//          sum = sum + arr[i];
//      }
      for (int i = 1; i < n; i = i + 2) {
        sum = sum + arr[i];
      }
      System.out.println(sum);
    }
}
