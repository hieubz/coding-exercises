package leetcode.easy;


import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {

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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // using a HashSet to check intersection node => extra space O(m)
        Set<ListNode> set = new HashSet<>();
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != null) {
            set.add(p1);
            p1 = p1.next;
        }
        while (p2 != null) {
            if (set.contains(p2)) {
                return p2;
            }
            p2 = p2.next;
        }
        return null;
    }

    /**
     * when use two pointer move forward with the same speed => cannot go to the common node at the same time
     * => we will let first pointer traverse the linked list A, then traverse the linked list B
     * => and let the second pointer traverse the linked list B, then traverse the list A
     * => if with the same steps, we could go to the common node at the same time
     *
     */

    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 != null) {
                p1 = p1.next;
            } else {
                p1 = headB;
            }

            if (p2 != null) {
                p2 = p2.next;
            } else {
                p2 = headA;
            }
        }
        return p1;
    }
}
