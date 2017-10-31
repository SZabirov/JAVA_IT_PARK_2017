package ru.itpark;

import java.util.Scanner;

//fact(n) = 1*2*3*...*(n-1)*n
//например, 5! = 1*2*3*4*5 = 120
public class Fact {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите n:");
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      //fact = fact * i;
      fact *= i;
    }
    System.out.println(n + "! = " + fact);
  }
}
