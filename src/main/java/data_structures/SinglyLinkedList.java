package data_structures;

import java.util.NoSuchElementException;

public class SinglyLinkedList {

  Node head;

  public static void main(String[] args) {
    SinglyLinkedList lList = new SinglyLinkedList();

    lList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    lList.head.next = second;
    second.next = third;

//    lList.delete(2);

    lList.deleteInPosition(1);

    Node curNode = lList.head;
    while (curNode != null) {
      System.out.println(curNode.val);
      curNode = curNode.next;
    }
  }

  private void add(Node prevNode, int newData) {

    if (prevNode == null) {
      System.out.println("the previous node can not be null!");
      return;
    }

    Node newNode = new Node(newData);
    newNode.next = prevNode.next;
    prevNode.next = newNode;
  }

  private void push(int newData) {
    Node newNode = new Node(newData);
    newNode.next = this.head;
    head = newNode;
  }

  private void append(int newData) {
    Node newNode = new Node(newData);

    if (head == null) {
      head = newNode;
      return;
    }

    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = newNode;
  }

  private int pop() {
    final Node f = head;
    if (f == null) throw new NoSuchElementException();
    final Node next = f.next;
    final int value = f.val;

    f.next = null; // help GC
    head = next;
    return value;
  }

  private void delete(int key) {
    // find the previous node of the node to be deleted
    // change the next of the previous node
    // remove the next of the deleted node
    Node cur = head;
    while (cur != null) {
      if (cur.next.val == key) {
        Node deletedNode = cur.next;
        cur.next = deletedNode.next;
        deletedNode.next = null;
        return;
      }
      cur = cur.next;
    }
  }

  private void deleteInPosition(int position) {
    if (head == null) return;
    Node temp = head;

    if (position == 0) {
      head = temp.next;
      return;
    }

    // find the previous node of the node to be deleted
    for (int i = 0; i < position - 1; i++) {
      temp = temp.next;
    }

    Node deletedNode = temp.next;
    temp.next = deletedNode.next;
    deletedNode.next = null;
  }

  static class Node {
    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }
}
