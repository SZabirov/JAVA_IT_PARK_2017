package ru.itpark;

public class Main {

  public static void main(String[] args) {
    int a = 5;
    int b = a;
    b =  10;

    int x = 0;
    assignTen(x);
    x = returnTen(x);
    System.out.println("x = " + x);

    int[] arr = new int[5];
    arr[0] = 0;

    int[] arr2 = arr;

    assignTen(arr);
    arr2[0] = 42;
    System.out.println("arr[0] = " + arr[0]);
  }

  static void assignTen(int x) {
    x = 10;
  }

  static int returnTen(int x) {
    x = 10;
    return x;
  }

  static void assignTen(int[] arr) {
    if (arr.length > 0) {
      arr[0] = 10;
    }
  }
}
