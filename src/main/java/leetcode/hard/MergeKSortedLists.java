package leetcode.hard;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    // put all nodes into a min heap and poll those nodes from that heap and build the new Linked List
    if (lists.length == 0) return null;
    ListNode dummy = new ListNode(-1);
    ListNode p = dummy;
    // init a min heap
    PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> (a.val - b.val));
    for (ListNode head : lists) {
      if (head != null) {
        queue.add(head);
      }
    }

    while (!queue.isEmpty()) {
      // poll the min node, put into the new list
      ListNode node = queue.poll();
      p.next = node;

      // push next of min node into queue
      if (node.next != null) {
        queue.add(node.next);
      }

      // move the pointer forward
      p = p.next;
    }

    return dummy.next;

  }

  class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public int getVal() {
      return val;
    }
  }
}
