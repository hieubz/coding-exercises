package core;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


public class DataStructureTest {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put(null, null);
    System.out.println(map);

    SortedSet<Integer> mySet = new TreeSet<>();
    mySet.add(1);
    mySet.add(10);
    mySet.add(5);
    mySet.add(-109);
    System.out.println(mySet);
    Math.sqrt(11);

  }
}
