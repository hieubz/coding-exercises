package leetcode.easy;

public class MaximumDepthofBinaryTreeV2 {

  public int maxDepth(TreeNode root) {

    if (root == null) return 0;

    int maxLeft = maxDepth(root.left);
    int maxRight = maxDepth(root.right);
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
