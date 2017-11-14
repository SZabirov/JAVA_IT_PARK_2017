package ru.itpark;

public abstract class Superhero {
  abstract void getToPlaceImmediately(Flyable v);

  abstract void getToPlaceStylish(Drivable v);

  void savePeople() {
    System.out.println("Все спасены! Ура!");
  }
}
