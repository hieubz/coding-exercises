package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
vector with N non zero elements

Space: O(N)
time: O(N)
 */

public class SparseVector {

  public Map<Integer, Integer> indexValueMap;

  SparseVector(int[] nums) {
      indexValueMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        indexValueMap.put(i, nums[i]);
      }
    }
  }

  public int dotProduct(SparseVector v) {
    int product = 0;
    for (int key : indexValueMap.keySet()) {
      if (v.indexValueMap.containsKey(key)) {
        product += indexValueMap.get(key) * v.indexValueMap.get(key);
      }
    }
    return product;
  }
}
