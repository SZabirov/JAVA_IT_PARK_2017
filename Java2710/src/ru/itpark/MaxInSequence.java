package ru.itpark;

import java.util.Scanner;

public class MaxInSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите кол-во чисел: ");
    int n = sc.nextInt();
    int max = 0;
    int number;
    System.out.println("Введите " + n + " чисел:");
    for (int i = 0; i < n; i++) {
      number = sc.nextInt();
      if (number > max){
        max = number;
      }
    }
    System.out.println("Максимум: " + max);
  }
}
