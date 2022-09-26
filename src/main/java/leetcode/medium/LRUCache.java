package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

  private final int capacity;
  private Node head = new Node(0, 0);
  private Node tail = new Node(0, 0);
  private Map<Integer, Node> cache = new HashMap<>();

  public LRUCache(int capacity) {
    this.capacity = capacity;
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    if (!cache.containsKey(key)) return -1;
    Node node = cache.get(key);
    removeFromLinkedList(node);
    insertToLinkedList(node);
    return node.value;
  }

  /** insert after the head */
  private void insertToLinkedList(Node node) {
    node.next = head.next;
    head.next.prev = node;
    head.next = node;
    node.prev = head;
  }

  private void removeFromLinkedList(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  public void put(int key, int value) {
    if (cache.containsKey(key)) {
      Node oldNode = cache.get(key);
      cache.remove(key);
      removeFromLinkedList(oldNode);
    }
    if (cache.size() == capacity) {
      cache.remove(tail.prev.key);
      removeFromLinkedList(tail.prev);
    }
    Node newNode = new Node(key, value);
    insertToLinkedList(newNode);
    cache.put(key, newNode);
  }

  class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }
}
