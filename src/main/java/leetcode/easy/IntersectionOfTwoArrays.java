package leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> result = new HashSet<>();
    for (int i : nums2) {
      if (set.contains(i)) result.add(i);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public int[] intersection2(int[] nums1, int[] nums2) {
    Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
    set1.retainAll(set2);
    return set1.stream().mapToInt(Integer::intValue).toArray();
  }

  public int[] intersection3(int[] nums1, int[] nums2) {
    boolean[] arr = new boolean[1001];
    int[] ans = new int[Math.min(nums1.length, nums2.length)];
    int k = 0;

    for (int i : nums1) {
      arr[i] = true;
    }

    for (int j : nums2) {
      if (arr[j]) {
        ans[k++] = j;
        arr[j] = false;
      }
    }

    return Arrays.copyOf(ans, k);
  }
}
