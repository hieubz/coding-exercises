package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

//  // Time O(n)
//  public List<Integer> inorderTraversal(TreeNode root) {
//    List<Integer> res = new ArrayList<>();
//    helper(root, res);
//    return res;
//  }
//
//  private void helper(TreeNode root, List<Integer> res) {
//    if (root != null) {
//      helper(root.left, res);
//      res.add(root.val);
//      helper(root.right, res);
//    }
//  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;

    while(curr != null || !stack.isEmpty()) {
      while(curr != null) {
        stack.push(curr);
        curr = curr.left;
      }

      curr = stack.pop();
      res.add(curr.val);
      curr = curr.right;
    }
    return res;
  }

  private class TreeNode {
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
