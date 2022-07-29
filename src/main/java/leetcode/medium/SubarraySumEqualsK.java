package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

  public int subarraySum(int[] nums, int k) {
    int count = 0;
    for (int start = 0; start < nums.length; start++) {
      for (int end = start + 1; end <= nums.length; end++) {
        int sum = 0;
        for (int i = start; i < end; i++) {
          sum += nums[i];
        }
        if (sum == k) {
          count += 1;
        }
      }
    }
    return count;
  }

  // apply accumulate sum: sum[i] is used to store the accumulate sum of nums
  // up to the element i - 1
  // O(n2)
  public int subarraySumV2(int[] nums, int k) {
    int count = 0;
    int[] sum = new int[nums.length + 1];
    sum[0] = 0;

    // accumulate
    for (int i = 1; i <= nums.length; i++) {
      sum[i] = sum[i - 1] + nums[i - 1];
    }
    for (int start = 0; start < nums.length; start++) {
      for (int end = start + 1; end <= nums.length; end++) {
        if (sum[end] - sum[start] == k) {
          count++;
        }
      }
    }
    return count;
  }

  public int subarraySumV3(int[] nums, int k) {
    int count = 0;
    for (int start = 0; start < nums.length; start++) {
      int sum = 0;
      for (int end = start; end < nums.length; end++) {
        sum += nums[end];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }


  // if sum[i] - sum[j] = k => the sum of elements lying between indices i and j is k
  public int subarraySumV4(int[] nums, int k) {
    int count = 0;
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : nums) {
      sum += num;

      // exist subarray with sum = k
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      // save num of occurrences of sum
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
  }
}
