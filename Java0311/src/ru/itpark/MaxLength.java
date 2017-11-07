package ru.itpark;

import java.util.Scanner;

public class MaxLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во эл-тов в массиве");
    int n = sc.nextInt();
    String[] arr = new String[n];
    System.out.println("Вводите слова с новой строки:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();
    }

    String max1 = "";
    String max2 = "";

    for (int i = 0; i < n; i++) {
      int len = arr[i].length();
      if (len > max1.length()) {
        max2 = max1;
        max1 = arr[i];
      } else {
        if (len > max2.length()){
          max2 = arr[i];
        }
      }
    }
    System.out.println("Top:");
    System.out.println("1) " + max1);
    System.out.println("2) " + max2);

  }
}
