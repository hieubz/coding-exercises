package leetcode.easy;

public class DiameterBinaryTree {

  int maxD = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    maxDepth(root);
    return maxD;
  }

  public int maxDepth(TreeNode root) {

    if (root == null) return 0;

    int maxLeft = maxDepth(root.left);
    int maxRight = maxDepth(root.right);
    maxD = Math.max(maxD, maxLeft + maxRight);
    return Math.max(maxLeft, maxRight) + 1;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
      this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
