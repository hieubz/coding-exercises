package leetcode.hard;

import java.util.HashMap;
import java.util.Map;

class LFUCache {

  private int capacity;
  private int minFreq;
  private Map<Integer, DoubleLinkedList> freqMap = new HashMap<>();
  private Map<Integer, Node> cache = new HashMap<>();

  public LFUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    if (!cache.containsKey(key)) return -1;
    Node node = cache.get(key);
    updateFreqList(node);
    return node.val;
  }

  public void put(int key, int value) {
    if (capacity == 0) return;
    // update value and frequency when exist
    if (cache.containsKey(key)) {
      Node node = cache.get(key);
      node.val = value;
      updateFreqList(node);
    } else {
      // remove when cache is full
      if (cache.size() == capacity) {
        DoubleLinkedList minFreqList = freqMap.get(minFreq);
        Node minNode = minFreqList.removeLast();
        cache.remove(minNode.key);
      }

      Node newNode = new Node(key, value);
      minFreq = 1;
      DoubleLinkedList curList = freqMap.getOrDefault(1, new DoubleLinkedList());
      curList.add(newNode);
      freqMap.put(1, curList);
      cache.put(key, newNode);
    }
  }

  private void updateFreqList(Node node) {
    // remove node from cur list
    DoubleLinkedList curList = freqMap.get(node.frequency);
    curList.remove(node);

    if (node.frequency == minFreq && curList.size == 0) minFreq++;

    node.frequency++;
    // insert into new list with new freq
    DoubleLinkedList newList = freqMap.getOrDefault(node.frequency, new DoubleLinkedList());
    newList.add(node);
    freqMap.put(node.frequency, newList);
  }

  class Node {
    int key;
    int val;
    Node next;
    Node prev;
    int frequency;

    public Node(int k, int v) {
      key = k;
      val = v;
      frequency = 1;
    }
  }

  class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList() {
      this.size = 0;
      head = new Node(0, 0);
      tail = new Node(0, 0);
      head.next = tail;
      tail.prev = head;
    }

    public void add(Node node) {
      node.next = head.next;
      head.next.prev = node;
      node.prev = head;
      head.next = node;
      size++;
    }

    public void remove(Node node) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
      size--;
    }

    public Node removeLast() {
      if (size > 0) {
        Node tailNode = tail.prev;
        remove(tailNode);
        return tailNode;
      }
      return null;
    }
  }
}
