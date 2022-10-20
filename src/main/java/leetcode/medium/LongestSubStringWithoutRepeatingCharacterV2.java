package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacterV2 {

    public static int lengthOfLongestSubstring(String s) {
        // use 2 pointers to scan through the string s and save the max to a var
        Map<Character, Integer> map = new HashMap<>();
        int max = 0,i = 0, j = 0;
        while (j < s.length()) {
            // move to the right of previous index of this character s.charAt(j)
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            // put the new index of this character
            map.put(s.charAt(j), j);
            // update max
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

  public static void main(String[] args) {
      HashSet<Integer> set1 = new HashSet<>();
      HashSet<Integer> set2 = new HashSet<>();
      Set<Integer> copy = new HashSet<>(set1);
      copy.retainAll(set2); // intersect
      copy.removeAll(set2); // difference
  }
}
