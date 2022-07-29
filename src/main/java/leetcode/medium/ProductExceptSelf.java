package leetcode.medium;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1; // init first value
        for (int i = 1; i < n; i++) {
            // instead of repeating the product for each element
            // we keep the result from the previous accumulated calculations - dynamic programming
            // Ex: we have an
            //  array   1   3    4      5
            // we calc  1   1    1*3  1*3*4
            // and   3*4*5  4*5  5      1
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        // to save space, I do not use arrays to store calculated values
        // instead, I use a variable to keep the accumulated values
        // => no extra space
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
