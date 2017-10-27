package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = sc.nextInt();
        System.out.print("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Сумма = " + (a + b));
    }
}
