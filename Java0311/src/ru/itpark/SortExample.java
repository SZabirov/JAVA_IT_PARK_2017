package ru.itpark;

import java.util.Arrays;
import java.util.Scanner;

public class SortExample {
  public static void main(String[] args) {
    int n = 5;
    int[] arr = {5, 3, 4, 1, 2};

    if (n > 1) {
      for (int j = 0; j < n - 1; j++) {
        int maxi = 0;
        for (int i = 0; i < n - j; i++) {
          if (arr[i] > arr[maxi]) {
            maxi = i;
          }
        }
        int buf = arr[n - j - 1];
        arr[n - j - 1] = arr[maxi];
        arr[maxi] = buf;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  
}
