package ru.itpark;

public class LinkedList<T> {
  Node<T> head;

  public void add(T value) {
    Node<T> newNode = new Node<>(value, null);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> curNode = head;
      while (curNode.next != null){
        curNode = curNode.next;
      }
      curNode.next = newNode;
    }
  }

  /**
   * Добавляет элемент в список под соответствующий индекс
   * @param index
   * @param value
   */
  public void add(int index, T value) {

  }

  //FIXME
  public T get(int index) {
    if (head == null) {
      return null;
    } else {
      Node<T> curNode = head;
      for (int i = 0; i < index; i++) {
        curNode = curNode.next;
      }
      return curNode.value;
    }
  }

  private class Node<T> {
    T value;
    Node<T> next;

    public Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
    }
  }
}
