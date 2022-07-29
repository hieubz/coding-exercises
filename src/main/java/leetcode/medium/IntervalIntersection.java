package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {

  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    int i = 0;
    int j = 0;
    List<int[]> res = new ArrayList<>();

    while (i < firstList.length && j < secondList.length) {
      int start = Math.max(firstList[i][0], secondList[j][0]);
      int end = Math.min(firstList[i][1], secondList[i][1]);
      if (start <= end) {
        res.add(new int[] {start, end});
      }

      if (firstList[i][1] < secondList[i][1]) {
        i += 1;
      } else {
        j += 1;
      }
    }

    return res.toArray(new int[res.size()][]);
  }
}
