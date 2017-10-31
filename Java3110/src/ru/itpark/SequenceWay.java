package ru.itpark;

import java.util.Scanner;

public class SequenceWay {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во чисел:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int k = 1;
    for (int i = 1; i < n; i++) {
      if (arr[i] <= arr[i + 1]){
        k = 0;
      }
    }
    if (k != 1){
      System.out.println("Не явл. возр.");
    } else {
      System.out.println("Явл. возр.");
    }
  }
}





