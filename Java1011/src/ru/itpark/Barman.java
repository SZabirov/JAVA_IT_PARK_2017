package ru.itpark;

public class Barman {
  void serve(Drink d){
    d.open();
    d.pour();
  }
}
