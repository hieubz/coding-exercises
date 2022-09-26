package core;

import java.util.*;

public class FinalTest {

  final int name;
  int[] a, b;

  public FinalTest(int name) {
    this.name = name;
  }

  public static void main(String[] args) {
    int[] numbers = new int[3];
    int[] arr = new int[]{1, 2, 3};

    List<Integer> numbers2 = new ArrayList<>();
    numbers2.indexOf(1);
    numbers2.sort(Comparator.reverseOrder());
    Collections.sort(numbers2);
    numbers2.add(1);
    numbers2.add(1);
    numbers2.add(2);
    numbers2.add(2);
    numbers2.removeAll(Arrays.asList(1));
    System.out.println(numbers2);

    List<String> s = new ArrayList<>();
    s.add("a");
    s.add("b");
    s.add("c");
    s.add("a");
    System.out.println(s.contains("a"));
    s.removeAll(Collections.singletonList("a"));
    s.clear();
    System.out.println(s);
    System.out.println(s.contains("a"));
  }
}
