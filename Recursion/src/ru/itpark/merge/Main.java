package ru.itpark.merge;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 8, 9};
    int[] arr2 = {0, 4, 5, 6, 7};
    int[] resultArr = merge(arr1, arr2);
    System.out.println(Arrays.toString(resultArr));
  }

  static int[] merge(int[] arr1, int[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    int[] resultArr = new int[m + n];
    int i =0, j = 0;
    int k = 0;
    while (i < m && j < n) {
      if (arr1[i] < arr2[j]) {
        resultArr[k] = arr1[i];
        i++;
      } else {
        resultArr[k] = arr2[j];
        j++;
      }
      k++;
    }
    while (i < m) {
      resultArr[k] = arr1[i];
      k++;
      i++;
    }
    while (j < n) {
      resultArr[k] = arr2[j];
      k++;
      j++;
    }
    return resultArr;
  }
}
