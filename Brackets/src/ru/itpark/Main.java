package ru.itpark;

public class Main {

    public static void main(String[] args) {
	  Stack stack = new Stack(10);
	  String str = "(){}{()}";
	  String s1 = String.valueOf(str.charAt(0));
	  stack.push("(");
      System.out.println(stack.pop());
    }
}
