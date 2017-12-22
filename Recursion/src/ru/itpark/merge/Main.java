package ru.itpark.merge;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    MergeSort mergeSort = new MergeSort();
    int[] arr = {3, 7, 8, 1, 4, 2, 5, 6, 7, 12};
    arr = mergeSort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
