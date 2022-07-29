package leetcode.medium;


public class RemoveNthNodeFromEndOfList {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode findNthFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        ListNode p2 = head;
        while(p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // use virtual head node technique to prevent the occurrence of null pointers
        // Ex: the linked list has total of 5 nodes, and the question asks you to delete the fifth node from the end
        // which is the first node. But we are finding the sixth node from the end first
        // the code will throw null pointer
        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode x = findNthFromEnd(dummy, n + 1);
        x.next = x.next.next;
        return dummy.next;
    }
}
