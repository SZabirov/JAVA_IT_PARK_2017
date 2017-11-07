package ru.itpark;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, 4, 2};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int n = arr.length;
    boolean wasSwap = true;
    for (int i = 0; (i < n - 1) & wasSwap; i++) {
      wasSwap = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          wasSwap = true;
        }
      }
    }
  }

  static void swap(int[] arr, int i1, int i2) {
    int buf = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = buf;
  }
}
