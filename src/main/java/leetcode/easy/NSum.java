package leetcode.easy;

import java.util.*;

public class NSum {

  public static List<List<Integer>> twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> checkedSet = new HashSet<>();
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i <= nums.length - 1; i++) {
      if (map.containsKey(target - nums[i]) && !checkedSet.contains(nums[i])) {
        res.add(Arrays.asList(nums[i], target - nums[i]));
        checkedSet.add(nums[i]);
        checkedSet.add(target - nums[i]);
      }
      map.put(nums[i], i);
    }
    return res;
  }

  public static int[] twoSum2(int[] nums, int target) {
    Arrays.sort(nums);
    int lo = 0;
    int hi = nums.length - 1;
    while (lo < hi) {
      int sum = nums[lo] + nums[hi];
      if (sum == target) {
        return new int[] {nums[lo], nums[hi]};
      } else if (sum < target) {
        lo++;
      } else {
        hi--;
      }
    }
    return new int[] {};
  }

  public static List<List<Integer>> twoSum3(int[] nums, int start, int target) {
    List<List<Integer>> res = new ArrayList<>();
    int hi = nums.length - 1;
    while (start < hi) {
      int left = nums[start];
      int right = nums[hi];
      int sum = left + right;
      if (sum == target) {
        res.add(new ArrayList<>(Arrays.asList(left, right)));
        while (start < hi && left == nums[start]) start++;
        while (start < hi && right == nums[hi]) hi--;
      } else if (sum < target) {
        while (start < hi && left == nums[start]) start++;
      } else {
        while (start < hi && right == nums[hi]) hi--;
      }
    }
    return res;
  }

  public static List<List<Integer>> threeSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      while (i < n - 1 && nums[i] == nums[i + 1]) i++;

      List<List<Integer>> tuples = twoSum3(nums, i + 1, target - nums[i]);
      for (List<Integer> tuple : tuples) {
        tuple.add(nums[i]);
        res.add(tuple);
      }
    }
    return res;
  }

  public static List<List<Integer>> threeSum2(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue;
      int lo = i + 1;
      int hi = nums.length - 1;
      int sum = target - nums[i];
      while (lo < hi) {
        if (nums[lo] + nums[hi] == sum) {
          res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
          while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
          while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
          lo++;
          hi--;
        } else if (nums[lo] + nums[hi] > sum) {
          while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
          hi--;
        } else {
          lo++;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 1, 2, 2, 2, 3};
    System.out.println(threeSum2(arr, 6));
  }
}
