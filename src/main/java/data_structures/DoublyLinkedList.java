package data_structures;

public class DoublyLinkedList {
  Node head;

  private void push(int val) {
    // allocate new node
    Node newNode = new Node(val);

    // mark next of new node is head and previous is null
    newNode.next = head;
    newNode.prev = null;

    // change head's prev
    // if this is the first time => head = null
    if (head != null) {
      head.prev = newNode;
    }

    // move the head to point to the new node
    head = newNode;
  }

  private int pop() {
    Node temp = head;
    head = temp.next;
    temp.next = null;
    head.prev = null;
    return temp.data;
  }

//  private int delete(int val) {}
//
//  private int deleteInPosition(int position) {}

  private void insert(int val, Node prevNode) {
    Node newNode = new Node(val);
    Node nextNode = prevNode.next;
    // front
    newNode.next = nextNode;
    // check if prevNode is the last node
    if (nextNode != null) {
      nextNode.prev = newNode;
    }

    // back
    prevNode.next = newNode;
    newNode.prev = prevNode;

  }

  class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    DoublyLinkedList llist = new DoublyLinkedList();
    llist.push(1);
    llist.push(2);
    llist.push(3);
    int val = llist.pop();
    System.out.println(val);
  }
}
