package leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

  // O(nlogn)
  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

  // O(nlogk) - space O(k) - not good, worse than using sort method in practices
  public int findKthLargestV2(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int val : nums) {
      pq.add(val);

      if (pq.size() > k) {
        // with empty queue: poll return null, remove throw an exception
        pq.poll();
      }
    }
    return pq.peek();
  }
}
