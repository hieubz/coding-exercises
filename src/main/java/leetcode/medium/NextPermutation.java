package leetcode.medium;

public class NextPermutation {
  public void nextPermutation(int[] nums) {
    int i = nums.length - 1;

    // find the longest non-increasing suffix
    while (i > 0 && nums[i - 1] >= nums[i]) {
      i--;
    }

    if (i <= 0) {
      reverseSuffix(nums, 0);
    }

    int pivot = i - 1;
    int lastIndex = nums.length - 1;
    // traverse through the suffix
    // to find the rightmost element greater than pivot
    while (nums[lastIndex] <= nums[pivot]) {
      lastIndex--;
    }

    // swap the pivot with j
    swap(nums, pivot, lastIndex);

    // reverse the suffix
    reverseSuffix(nums, i);
  }

  private void reverseSuffix(int[] nums, int start) {
    int end = nums.length - 1;
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
