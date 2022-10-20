package data_structures;

public class BinaryTreeTest {

  void traverse(Node n) {
    traverse(n.left);
    traverse(n.right);
  }


  class Node {
    int val;
    Node left, right;
  }
}
