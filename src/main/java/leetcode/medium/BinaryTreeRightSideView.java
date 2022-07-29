package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

  private void dfs(TreeNode node, List<Integer> res, int depth) {
    if (node != null) {

      // meet this depth for first time => add node value
      // if depth > result size => already added right side value
      if (res.size() == depth) {
        res.add(node.val);
      }
      // go right side first
      dfs(node.right, res, depth + 1);
      dfs(node.left, res, depth + 1);
    }
  }

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    dfs(root, result, 0);

    return result;
  }

  private class TreeNode {
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
