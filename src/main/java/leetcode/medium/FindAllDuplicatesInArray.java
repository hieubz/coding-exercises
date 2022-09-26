package leetcode.medium;

import java.util.*;

public class FindAllDuplicatesInArray {
  public List<Integer> findDuplicates(int[] nums) {
    Set<Integer> set = new HashSet<>();
    List<Integer> result = new ArrayList<>();
    for (int n : nums) {
      if (set.contains(n)) {
        result.add(n);
      } else {
        set.add(n);
      }
    }
    return result;
  }
}
