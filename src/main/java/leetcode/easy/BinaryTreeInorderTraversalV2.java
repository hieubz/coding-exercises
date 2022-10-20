package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalV2 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    res.addAll(preorderTraversal(root.left));
    res.addAll(preorderTraversal(root.right));
    return res;
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    res.addAll(postorderTraversal(root.left));
    res.addAll(postorderTraversal(root.right));
    res.add(root.val);
    return res;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
      this.val = val;
    }

    public TreeNode(
        int val,
        TreeNode left,
        TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
