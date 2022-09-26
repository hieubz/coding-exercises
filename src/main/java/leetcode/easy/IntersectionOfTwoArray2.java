package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArray2 {

  public static int[] intersect(int[] nums1, int[] nums2) {
    // should use smaller array to build hash map => reduce space
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums1) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    int[] res = new int[Math.min(nums1.length, nums2.length)];
    int k = 0;
    for (int n : nums2) {
      if (map.containsKey(n) && map.get(n) > 0) {
        res[k++] = n;
        map.put(n, map.get(n) - 1);
      }
    }
    return Arrays.copyOf(res, k);
  }


  public static int[] intersectWithSortedArray(int[] nums1, int[] nums2) {
    int[] res = new int[Math.min(nums1.length, nums2.length)];
    int i = 0, j = 0, k = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] > nums2[j]) {
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        res[k++] = nums1[i];
        i++;
        j++;
      }
    }

    return Arrays.copyOf(res, k);
  }


  public static void main(String[] args) {
    int[] nums1 = new int[] {4, 4, 5};
    int[] nums2 = new int[] {1, 4, 4, 8, 4};
    System.out.println(Arrays.toString(intersect(nums1, nums2)));
  }

  // follow up: What if elements of nums2 are stored on disk,
  // and the memory is limited such that you cannot load all elements into the memory at once?
  // => divide and conquer: slice num2 into many chunks to fit into memory, write partial results to memory
  // in practice if needed we could use Map Reduce with Spark for big data

}
