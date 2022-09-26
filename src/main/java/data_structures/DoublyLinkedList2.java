package data_structures;

public class DoublyLinkedList2 {

  Node head, tail = null;

  static class Node {
    int data;
    Node prev;
    Node next = null;

    public Node(int data) {
      this.data = data;
    }
  }

  public void push(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      head = newNode;
      tail = newNode;
      head.prev = null;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public void displayAll() {
    if (head == null) {
      System.out.println("the doubly linked list is empty!");
      return;
    }
    Node currentNode = head;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  public static void main(String[] args) {
    DoublyLinkedList2 linkedList = new DoublyLinkedList2();
    linkedList.push(1);
    linkedList.push(20);
    linkedList.push(10);
    linkedList.displayAll();
  }
}
