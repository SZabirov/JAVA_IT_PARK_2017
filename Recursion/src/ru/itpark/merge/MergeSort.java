package ru.itpark.merge;

public class MergeSort {
  int[] sort(int[] array) {
    int[] result = mergeSort(array);
    return result;
  }

  int[] mergeSort(int[] array) {
    int n = array.length;
    if (n <= 2) {
      if (n == 2) {
        if (array[1] < array[0]) {
          int buf = array[1];
          array[1] = array[0];
          array[0] = buf;
        }
      }
      return array;
    } else {
      int len1, len2;
      if (n % 2 == 0) {
        len1 = n / 2;
        len2 = n / 2;
      } else {
        len1 = (n + 1) / 2;
        len2 = n / 2;
      }
      int[] arr1 = new int[len1];
      int[] arr2 = new int[len2];
      for (int i = 0; i < len1; i++) {
        arr1[i] = array[i];
      }
      for (int i = len1; i < n; i++) {
        arr2[i - len1] = array[i];
      }
      arr1 = mergeSort(arr1);
      arr2 = mergeSort(arr2);
      int[] result = merge(arr1, arr2);
      return  result;
    }
  }

  int[] merge(int[] arr1, int[] arr2) {
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
