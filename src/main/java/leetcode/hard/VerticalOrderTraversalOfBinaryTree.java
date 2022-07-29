package leetcode.hard;

import java.util.*;

public class VerticalOrderTraversalOfBinaryTree {

  Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mapVerticals = new HashMap<>();
  int minX = 0, maxX = 0;

//  public List<List<Integer>> verticalTraversal(TreeNode root) {
//    helper(root, 0, 0);
//
//
//
//
//  }


  private void helper(TreeNode node, int x, int y) {

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
