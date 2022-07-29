package leetcode.medium;

import java.util.List;

public class BinaryTreeVerticalOrderTraversal {
//  public List<List<Integer>> verticalOrder(TreeNode root) {
//
//  }

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
