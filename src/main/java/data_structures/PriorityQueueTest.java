package data_structures;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

  public static void main(String[] args) {
    // min heap as default => poll the least one first
    PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.comparing(Integer::byteValue));

    // max heap => poll the greatest one first
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    p.add(10);
    maxHeap.add(10);
    p.add(20);
    maxHeap.add(20);
    p.add(3);
    maxHeap.add(3);
//    while (!p.isEmpty()) {
//      System.out.println(p.poll());
//    }
//
//    while (!maxHeap.isEmpty()) {
//      System.out.println(maxHeap.poll());
//    }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap2 = new PriorityQueue<>(Collections.reverseOrder());
    minHeap.add(10);
    minHeap.add(1);
    minHeap.add(5);
    maxHeap2.add(1);
    maxHeap2.add(20);
    maxHeap2.add(40);
    while (!minHeap.isEmpty()) {
      System.out.println(minHeap.poll());
    }

    while (!maxHeap2.isEmpty()) {
      System.out.println(maxHeap2.poll());
    }
  }
}
