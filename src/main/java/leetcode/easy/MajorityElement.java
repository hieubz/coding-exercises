package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MajorityElement {
  public int majorityElement(int[] nums) {
    int length = nums.length;
    Map<Integer, Integer> mapCount = new HashMap<>();
    for (Integer num : nums) {
      Integer count = mapCount.get(num);
      if (Objects.isNull(count)) {
        mapCount.put(num, 1);
      } else {
        mapCount.put(num, count + 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : mapCount.entrySet()) {
      if (entry.getValue() > length / 2) {
        return entry.getKey();
      }
    }
    return 0;
  }
}
