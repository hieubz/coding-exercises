package leetcode.easy;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int slow = 0;
        int fast = 0;
        while(fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        // assign rest of array to zero
        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }
}
