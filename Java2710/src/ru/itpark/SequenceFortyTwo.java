package ru.itpark;

//HW1

import java.util.Scanner;

/**
 * сколько раз в послед-сти встр. 42
 */
public class SequenceFortyTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во чисел:");
    int n = sc.nextInt();
    int x;
    int count = 0;
    for (int i = 0; i < n; i++) {
      x = sc.nextInt();
      if (x == 42) {
        count++;
      }
    }
    System.out.println(count);
  }
}







