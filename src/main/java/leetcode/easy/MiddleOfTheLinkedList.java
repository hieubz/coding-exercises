package leetcode.easy;

public class MiddleOfTheLinkedList {

  /**
   * we cant directly get the length of the singly linked list a slow and a fast pointer firstly
   * point to the head whenever the slow move forward one step, the fast pointer move forward 2
   * steps, so that when the fast pointer reaches the end of the list the slow pointer will point to
   * the midpoint of the list
   */
  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
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
