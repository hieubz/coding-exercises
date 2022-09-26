package algorithms.sort;

import java.util.Arrays;

public class QuickSort {
  public static void sort(int[] nums) {
    if (nums.length <= 1) return;
    quickSort(nums, 0, nums.length - 1);
  }

  private static void quickSort(int[] nums, int l, int r) {
    // divide and conquer
    if (l < r) {
      int p = partition(nums, l, r);
      quickSort(nums, l, p - 1);
      quickSort(nums, p + 1, r);
    }
  }

  private static int partition(int[] nums, int l, int r) {
    int pivot = nums[r];
    int index = l;
    while (index < r) {
      if (nums[index] < pivot) {
        swap(nums, l, index);
        l++;
      }
      index++;
    }
    swap(nums, l, r);
    return l;
  }


  private static void swap(int[] nums, int l, int r) {
    int temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1,5,3,2,1,10,32,15};
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
