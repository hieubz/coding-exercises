package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        // hashmap to store character and their last indexes
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        // init 2 pointers which define the max substring, move the right pointer to scan through the string
        // and meanwhile update the hashmap
        // if the character is already in the hashmap => move the left pointer to the right of the same character last found
        // so that we could reduce the duplicate in the substring we are checking
        for (int r = 0, l = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                // reduce the duplicate
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }
            // update last index of this character
            map.put(s.charAt(r), r);
            // calc the max
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

  // - BFS: can take advantage of the locality of files in a direactory => with this case, BFS could
  // be faster than DFS
  // - file content is very large: in a real life, we will not hash entire file content, since it's
  // not practical. Instead we will map all the files according to size. Files with different sizes
  // are guaranteed to be different. Then we will hash a small part of the files with equal length
  // using MD5 for example. Only if the md5 is the same, we will compare the files character by
  // character.
  //
  // - this won't change the solution. We can create the hash from 1kb chunk and then read the
  // entire file if hashes are equal.
  //
  // - time complexity: O(n^2 * k) since the worse case when all files have the same size and same
  // hash
  // - the most time consuming part: compare the file
  // - the most memory consuming part: when generating hash for every file
  // => optimize: compare the file size first, then we generate and compare the hashes, finally we
  // compare byte by byte.
  // => you should choose and use the better hashing algorithms

  public static void main(String[] args) {
    String s = "abcabcbb";
    System.out.println(lengthOfLongestSubstring(s));
  }
}
