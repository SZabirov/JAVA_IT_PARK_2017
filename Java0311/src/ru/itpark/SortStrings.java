package ru.itpark;

import java.util.Arrays;

public class SortStrings {
  public static void main(String[] args) {
    String[] arr = {"abc", "rtere", "", "75a"};
    sort(arr);
    System.out.println(Arrays.toString(arr));

    String[] arr1 = {"asdf", "rtef", "dfsdf", "a"};
    sort(arr1);
    System.out.println(Arrays.toString(arr1));
  }

  static void sort (String[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int indexOfMax = 0;
      for (int j = 0; j < n - i; j++) {
        if (arr[indexOfMax].length() < arr[j].length()) {
          indexOfMax = j;
        }
      }
      String buf = arr[indexOfMax];
      arr[indexOfMax] = arr[n - i - 1];
      arr[n - i - 1] = buf;
    }
  }
}
