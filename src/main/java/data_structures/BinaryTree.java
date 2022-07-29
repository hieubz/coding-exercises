package data_structures;

public class BinaryTree {

  Node root;

  BinaryTree() {
    root = null;
  }

  void printInOrder(Node node) {
    if (node == null) {
      return;
    }

    printInOrder(node.left);

    System.out.println(node.val);

    printInOrder(node.right);
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(4);
    tree.root.left = new Node(2);
    tree.root.right = new Node(5);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(3);
    tree.printInOrder(tree.root);
  }
}
