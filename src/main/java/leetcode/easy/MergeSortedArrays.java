package leetcode.easy;

public class MergeSortedArrays {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int idx = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] >= nums2[j]) {
        nums1[idx] = nums1[i];
        i -= 1;
        idx -= 1;
      } else {
        nums1[idx] = nums2[j];
        j -= 1;
        idx -= 1;
      }
    }

    while (j >= 0) {
      nums1[idx] = nums2[j];
      j -= 1;
      idx -= 1;
    }
  }
}
