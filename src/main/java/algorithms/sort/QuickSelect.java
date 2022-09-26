package algorithms.sort;

import java.util.Random;

public class QuickSelect {

  // find the Kth largest => find the N-K th smallest
  public static int findKthLargest(int[] nums, int k) {
    int len = nums.length;
    return quickSelect(nums, 0, len - 1, len - k);
  }

  /**
   * Quick Select is an algorithm to find the Kth smallest element in an unordered list Time O(n)
   * Space O(logN)
   */
  private static int quickSelect(int[] nums, int left, int right, int k) {
    // in case we check the last partition with one element
    if (left == right) return nums[left];
    int pIndex = partition(nums, left, right);
    // if the pivot index is at our Kth smallest
    if (pIndex == k) {
      return nums[k];
    } else if (pIndex < k) {
      // pivot index come before the Kth smallest => perform quick select on the right partition
      return quickSelect(nums, pIndex + 1, right, k);
    } else {
      // pivot index come after the Kth smallest => perform quick select on the left partition
      return quickSelect(nums, left, pIndex - 1, k);
    }
  }

  private static int partition(int[] nums, int left, int right) {
    // get the random index between left - right
    int pIndex = new Random().nextInt(right - left + 1) + left;
    // swap between pivot and the last element
    swap(nums, pIndex, right);
    int i = left;
    while (i < right) {
      if (nums[i] < nums[right]) {
        swap(nums, left, i);
        left++;
      }
      i++;
    }

    // swap the pivot to separate the greater partition and smaller partition
    swap(nums, left, right);
    return left;
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 1, 5, 6, 4};
    System.out.println(findKthLargest(arr, 2));
  }
}
