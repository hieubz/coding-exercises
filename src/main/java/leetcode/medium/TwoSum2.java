package leetcode.medium;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length == 0) return result;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

  public static void main(String[] args) {
    int[] arr = new int[] {2,7,11,15};
    System.out.println(Arrays.toString(twoSum(arr, 9)));
  }
}
