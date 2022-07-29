package leetcode.medium;

class BrowserHistory {

  Node first;
  Node last;
  Node cur;
  int size = 0;

  public BrowserHistory(String homepage) {
    this.visit(homepage);
  }

  public static void main(String[] args) {
    BrowserHistory b = new BrowserHistory("A");
    b.visit("B");
    b.visit("C");
    b.visit("D");
    System.out.println(b.back(1));
    b.visit("E");
    System.out.println(b.back(1));
    System.out.println(b.forward(1));
  }

  public void visit(String url) {
    if (cur == last) {
      visitLast(url);
    } else {
      visitAfterCur(url);
    }
  }

  private void visitAfterCur(String url) {
    final Node newNode = new Node(cur, url, null);
    cur.next = newNode;
    last = newNode;
    cur = newNode;
  }

  public void visitLast(String url) {
    final Node l = last;
    final Node newNode = new Node(l, url, null);
    last = newNode;
    cur = newNode;
    if (l == null) {
      first = newNode;
    } else {
      l.next = last;
    }
    size++;
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
    Node next;
    Node prev;

    Node(Node prev, String u, Node next) {
      this.url = u;
      this.prev = prev;
      this.next = next;
    }
  }
}
