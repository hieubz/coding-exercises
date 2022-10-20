package leetcode.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCacheV2 {

  private int capacity;
  private int minFreq;
  private Map<Integer, LinkedList<Node>> freqMap = new HashMap<>();
  private Map<Integer, Node> cache = new HashMap<>();

  public LFUCacheV2(int capacity) {
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
    if (cache.containsKey(key)) {
      Node node = cache.get(key);
      node.val = value;
      updateFreqList(node);
    } else {
      if (cache.size() == capacity) {
        LinkedList<Node> minFreqList = freqMap.get(minFreq);
        Node minNode = minFreqList.removeLast();
        cache.remove(minNode.key);
      }
      Node newNode = new Node(key, value);
      minFreq = 1;
      // sai
      LinkedList<Node> curList = freqMap.getOrDefault(1, new LinkedList<>());
      curList.addFirst(newNode);
      freqMap.put(1, curList);
      cache.put(key, newNode);
    }
  }

  private void updateFreqList(Node node) {
    // remove node from cur list
    LinkedList<Node> curList = freqMap.get(node.frequency);
    curList.remove(node);

    if (node.frequency == minFreq && curList.size() == 0) minFreq++;

    node.frequency++;
    // insert into new list with new freq
    LinkedList<Node> newList =
        freqMap.getOrDefault(node.frequency, new LinkedList<>());
    newList.addFirst(node);
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
}
