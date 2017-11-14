package ru.itpark;

public abstract class Drink {
  /**
   * Метод открывает напиток
   */
  abstract void open();

  void pour() {
    System.out.println("Буль-буль");
  }
}
