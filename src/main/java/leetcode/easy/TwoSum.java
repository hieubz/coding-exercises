package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numMap.containsKey(target - nums[i])) {
        return new int[] {i, numMap.get(target - nums[i])};
      }
      numMap.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    String numbers = s.nextLine();
    int[] nums = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    Map<Integer, Integer> mapNum = new HashMap<>();
    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
      mapNum.put(nums[i], i);
    }

    for (int i = 0; i < nums.length - 1; i++) {
      int sum = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        sum += nums[j];
        if (mapNum.containsKey(sum)) {
          maxLen = sum;
        }
      }
    }

    System.out.println(maxLen);
  }
}
