package core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PassByValueTest {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(100);
    updateList(l);
    System.out.println(l.get(1));

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.addFirst(2);
    linkedList.addFirst(4);
    linkedList.removeLast();

  }

  private static void updateList(List<Integer> l) {
    l.set(1, 200);
  }
}
