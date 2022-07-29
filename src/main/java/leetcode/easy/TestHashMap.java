package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHashMap {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(Arrays.asList(1, 3, 5));
    int maxIndex = Math.min(10, l.size());
    System.out.println(l.subList(1, maxIndex));
  }
}
