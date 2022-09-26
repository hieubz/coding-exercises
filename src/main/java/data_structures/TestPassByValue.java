package data_structures;

import java.util.*;

public class TestPassByValue {

  public static void main(String[] args) {
    Dog dog = new Dog("Max");

    System.out.println("first = " + dog);
    changeDog(dog);
    System.out.println(dog.name);


    String a = "1";
    changeString(a);
    System.out.println(a);

    Set<Integer> list = new HashSet<>();
    list.add(null);
    System.out.println(Arrays.toString(list.toArray()));

    SortedSet<Integer> set = new TreeSet<>();

  }

  private static void changeString(String a) {
    a = "100";
  }

  private static void replaceDog(Dog dog) {
    dog = null;
  }

  private static void changeDog(Dog dog) {
    dog.name = null;
  }
}
