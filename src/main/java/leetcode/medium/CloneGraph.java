package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

  public Node dfs(Node node, Map<Node, Node> nodeMap) {

    // already created a copy => return the copy
    if (nodeMap.containsKey(node)) {
      return nodeMap.get(node);
    }

    // otherwise => create a copy, put to hashmap
    Node copyNode = new Node(node.val, new ArrayList<>());
    nodeMap.put(node, copyNode);

    // for each neighbor => create a copy neighbor and put to neighbor list of this node
    for (Node neighbor : node.neighbors) {
      copyNode.neighbors.add(dfs(neighbor, nodeMap));
    }
    return copyNode;
  }

  public Node cloneGraph(Node node) {

    if (node == null) {
      return null;
    }

    Map<Node, Node> nodeMap = new HashMap<>();
    return dfs(node, nodeMap);
  }

  private class Node {
    int val;
    List<Node> neighbors;

    public Node() {
      val = 0;
      neighbors = new ArrayList<>();
    }

    public Node(int _val) {
      this.val = _val;
      this.neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
      this.val = _val;
      this.neighbors = _neighbors;
    }
  }
}
