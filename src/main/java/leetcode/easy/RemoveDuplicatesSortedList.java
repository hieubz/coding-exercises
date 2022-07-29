package leetcode.easy;

import java.util.List;

public class RemoveDuplicatesSortedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
       if (head == null) return null;
       ListNode slow = head;
       ListNode fast = head;
       while (fast != null) {
           if (slow.val != fast.val) {
               // disconnect from the duplicates
               slow.next = fast;
               // move the pointer forward
               slow = slow.next;
           }
           // move the fast pointer forward
           fast = fast.next;
        }
       // set null to end
       slow.next = null;
       return head;
    }
}
