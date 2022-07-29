package leetcode.easy;

public class LInkedListCycle {

  /**
   * when a linked list has a cycle in it, we could use a fast and slow pointer if fast pointer
   * finally reach the end, it means there is no cycle if fast pointer finally meet the slow
   * pointer, there is a cycle in the list fast pointer has more than slow one cycle
   */
  boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
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
  }
}
