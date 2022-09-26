package leetcode.easy;

import java.util.*;

public class ContainDuplicate2 {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer ord = map.put(nums[i], i);
      if (ord != null && i - ord <= k) return true;
    }

    return false;
  }
}
