package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer>[] bucket = new List[nums.length + 1];
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // save to bucket with frequency as index
    for (int key : map.keySet()) {
      int frequency = map.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> result = new ArrayList<>();

    // traverse from the tail to the head of bucket list
    for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
      if (bucket[i] != null) result.addAll(bucket[i]);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
