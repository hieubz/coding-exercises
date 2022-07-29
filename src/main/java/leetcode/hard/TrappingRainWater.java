package leetcode.hard;

public class TrappingRainWater {

  public int trap(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }

    int left = 0;
    int right = height.length - 1;
    int ans = 0;
    int leftMax = 0;
    int rightMax = 0;

    while (left < right) {
      if (height[left] < height[right]) {
        if (height[left] >= leftMax) {
          leftMax = height[left];
        } else {
          ans += leftMax - height[left];
        }
        left += 1;
      } else {
        if (height[right] >= rightMax) {
          rightMax = height[right];
        } else {
          ans += rightMax - height[right];
        }
        right += 1;
      }
    }
    return ans;
  }
}
