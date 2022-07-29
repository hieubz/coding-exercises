package leetcode.medium;

import java.util.*;

public class MergeIntervals {

  // we will sort the intervals by their start value,
  // then each set of intervals that can be merged will appear contiguously in the list

  public int[][] merge(int[][] intervals) {
    // sort by start values
    Arrays.sort(intervals, Comparator.comparing(r -> r[0]));

    LinkedList<int[]> merged = new LinkedList<>();
    // we insert the first interval into our merged list
    // check if the previous interval end is less than the current interval start => add to the list
    // else we merge the current interval into the previous one
    // if the current end is less than the previous end
    for (int[] interval : intervals) {
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      } else {
        merged.getLast()[1] = Math.max(interval[1], merged.getLast()[1]);
      }
    }

    return merged.toArray(new int[merged.size()][]);
  }

  public static void main(String[] args) {
    Set<String> mySet = new HashSet<>();
  }
}
