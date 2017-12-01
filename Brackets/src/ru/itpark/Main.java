package ru.itpark;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack(10);
    String str = "(){}{()}";
    for (int i = 0; i < str.length(); i++) {
      String s1 = String.valueOf(str.charAt(i));
      if (s1.equals("(") || s1.equals("{") || s1.equals("[")) {
        stack.push(s1);
      } else {
        String bracketFromStack = stack.pop();
        if (bracketFromStack.equals("(")){
          if (s1.equals(")")){
            //норм
          } else {
            //не норм
          }
        }
        if (bracketFromStack.equals("{")){
          if (s1.equals("}")){
            //норм
          } else {
            //не норм
          }
        }
        if (bracketFromStack.equals("[")){
          if (s1.equals("]")){
            //норм
          } else {
            //не норм
          }
        }
      }
    }

    stack.push("(");
    System.out.println(stack.pop());
  }
}
