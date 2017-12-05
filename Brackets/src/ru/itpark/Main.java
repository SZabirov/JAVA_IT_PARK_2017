package ru.itpark;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack(100);
    String str = "((((((((((((({{}()}[])";
    boolean sequenceIsCorrect = true;
    try {
      for (int i = 0; i < str.length(); i++) {
        String curSymbol = String.valueOf(str.charAt(i));
        if (curSymbol.equals("(") || curSymbol.equals("{") || curSymbol.equals("[")) {
          stack.push(curSymbol);
        } else {
          String bracketFromStack = stack.pop();
          if (curSymbol.equals(")")) {
            if (!bracketFromStack.equals("(")) {
              sequenceIsCorrect = false;
            }
          }
          if (curSymbol.equals("}")) {
            if (!bracketFromStack.equals("{")) {
              sequenceIsCorrect = false;
            }
          }
          if (curSymbol.equals("]")) {
            if (!bracketFromStack.equals("[")) {
              sequenceIsCorrect = false;
            }
          }
        }
      }
    } catch (NoElementsInStackException e) {
      sequenceIsCorrect = false;
    }
    if (stack.size() != 0) {
      sequenceIsCorrect = false;
    }
    System.out.println(sequenceIsCorrect);
  }
}
