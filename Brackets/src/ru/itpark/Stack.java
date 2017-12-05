package ru.itpark;

public class Stack {
  private String[] array;
  private int counter;

  public Stack(int size) {
    array = new String[size];
    counter = 0;
  }

  void push(String elem) {
    //fixme
    if (counter < array.length) {
      array[counter] = elem;
      counter++;
    }
  }

  String pop() throws NoElementsInStackException {
    if (counter > 0) {
      int numToReturn = counter - 1;
      counter--;
      return array[numToReturn];
    } else {
      throw new NoElementsInStackException("Стек пуст!");
    }
  }

  int size() {
    return counter;
  }
}
