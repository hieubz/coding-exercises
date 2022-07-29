package leetcode.medium;

public class BrowserHistoryBasic {

  Node cur;
  Node head;

  public BrowserHistoryBasic(String homepage) {
    head = new Node(null, homepage, null);
    cur = head;
  }

  public static void main(String[] args) {
    BrowserHistoryBasic b = new BrowserHistoryBasic("A");
    b.visit("B");
    b.visit("C");
    b.visit("D");
    System.out.println(b.back(1));
    b.visit("E");
    System.out.println(b.back(1));
    System.out.println(b.forward(1));
  }

  public void visit(String url) {
    final Node newNode = new Node(cur, url, null);
    cur.next = newNode;
    cur = newNode;
  }

  public String back(int steps) {
    while (steps > 0) {
      if (cur.prev == null) return cur.url;
      cur = cur.prev;
      steps--;
    }
    return cur.url;
  }

  public String forward(int steps) {
    while (steps > 0) {
      if (cur.next == null) return cur.url;
      cur = cur.next;
      steps--;
    }
    return cur.url;
  }

  private static class Node {
    String url;
    Node prev, next;

    Node(Node prev, String url, Node next) {
      this.url = url;
      this.prev = prev;
      this.next = next;
    }
  }
}
