package ru.itpark;

public class BoolExample {
  public static void main(String[] args) {
    boolean b = true;
    int x = 3;
    boolean c = x > 5;
    //логическое и (конъюнкция)
    boolean q = b & c;
    if (b) {
      System.out.println("b = true");
    }
  }
}
