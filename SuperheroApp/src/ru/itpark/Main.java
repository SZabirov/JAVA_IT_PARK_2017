package ru.itpark;

public class Main {

    public static void main(String[] args) {
      Superhero b = new Batman();
      Drivable batmobile = new Batmobile();
      Delorian delorian = new Delorian();
      b.getToPlaceStylish(batmobile);

      b.getToPlaceStylish(delorian);
      b.getToPlaceImmediately(delorian);
    }
}
