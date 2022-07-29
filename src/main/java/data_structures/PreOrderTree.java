package data_structures;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTree {

  List<Integer> preorder(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }

    res.add(root.val);
    res.addAll(preorder(root.left));
    res.addAll(preorder(root.right));
    return res;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {};

    TreeNode(int val) {
      this.val = val;
    }
  }
}
