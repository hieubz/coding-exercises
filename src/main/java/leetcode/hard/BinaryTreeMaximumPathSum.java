package leetcode.hard;

public class BinaryTreeMaximumPathSum {

  private int maxSum;

  public int maxPathSum(TreeNode root) {
    maxSum = Integer.MIN_VALUE;
    maxSumHelper(root);
    return maxSum;
  }

  private int maxSumHelper(TreeNode root) {

    if (root == null) return 0;

    int leftMax = maxSumHelper(root.left);
    int rightMax = maxSumHelper(root.right);

    int maxRightLeft = Math.max(leftMax, rightMax);
    int maxOneNodeRoot = Math.max(root.val, (root.val + maxRightLeft));
    int maxAll = Math.max(maxOneNodeRoot, root.val + leftMax + rightMax);

    // assign greater value to result
    maxSum = Math.max(maxSum, maxAll);

    // return value to the higher levels
    return maxOneNodeRoot;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
