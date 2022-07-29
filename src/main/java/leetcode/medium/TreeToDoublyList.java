package leetcode.medium;

public class TreeToDoublyList {

  private Pair dfs(Node root) {

    // root is a leaf
    if (root.left == null && root.right == null) {
      root.left = root;
      root.right = root;
      return new Pair(root, root);
    }

    // left tree for the left side of the root
    Pair leftTree = null;
    if (root.left != null) {
      leftTree = dfs(root.left);
      leftTree.last.right = root;
      root.left = leftTree.last;
    }

    // right tree for the right side of the root
    Pair rightTree = null;
    if (root.right != null) {
      rightTree = dfs(root.right);
      root.right = rightTree.first;
      rightTree.first.left = root;
    }

    // make a circular doubly linked list
    Node first = leftTree == null ? root : leftTree.first;
    Node last = rightTree == null ? root : rightTree.last;
    first.left = last;
    last.right = first;

    return new Pair(first, last);
  }

  public Node treeToDoublyList(Node root) {
    if (root == null) {
      return root;
    }

    return dfs(root).first;
  }

  public Node treeToDoublyListV2(Node root) {
    Node head = this.convert(root, null);
    // now we have the head of the linked list
    return head;
  }

  public Node convert(Node p, Node head) {
    if (p == null) {
      return p;
    }

    Node prev = null;
    convert(p.left, head);
    if (prev == null) {
      // initialize first node of linked list
      head = p;
    } else {
      // add new node to Doubly Linked List
      p.left = prev;
      prev.right = p;
    }
    prev = p;
    convert(p.right, head);
    return head;
  }

  // pair of first node and last node
  private class Pair {
    public Node first;
    public Node last;

    public Pair(Node first, Node last) {
      this.first = first;
      this.last = last;
    }
  }

  private class Node {
    int val;
    Node left;
    Node right;

    public Node() {}

    public Node(int _val) {
      this.val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
      this.val = _val;
      this.left = _left;
      this.right = _right;
    }
  }
}
