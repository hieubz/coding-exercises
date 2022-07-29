package data_structures;

import java.util.LinkedList;

public class SingleLinkedListTest {

    Node first;
    Node last;
    int size = 0;

    void linkFirst(int e) {
        final Node f = first;
        final Node newNode = new Node(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    void linkLast(int e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    void linkAfter(int e, Node succ) {
        final Node pred = succ.prev;
        final Node newNode = new Node(pred, e, succ);
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
            succ.prev = newNode;
        }
        size++;
    }

    private static class Node {
        int val;
        Node next;
        Node prev;

        Node(Node prev, int v, Node next) {
            this.val = v;
            this.prev = prev;
            this.next = next;
        }
    }

}
