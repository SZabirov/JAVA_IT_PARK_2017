package ru.itpark;

public class Batman extends Superhero {
  @Override
  void getToPlaceImmediately(Flyable v) {

  }

  @Override
  void getToPlaceStylish(Drivable v) {
    System.out.println("I AM BATMAN! I am going to drive!");
    v.drive();
  }
}
