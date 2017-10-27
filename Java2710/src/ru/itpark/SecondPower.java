package ru.itpark;

public class SecondPower {
  public static void main(String[] args) {
    int x = 2;
    int power = 30;
    int n = 1;
    for (int i = 0; i < power; i++) {
      n = n * x;
    }
    System.out.println(n);
    int maxIntValue = n - 1 + n;
    System.out.println(maxIntValue);
    System.out.println(maxIntValue + 1);
  }}
