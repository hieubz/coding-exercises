package core.employee;

import core.aquarium.jellies.*;

import java.util.function.Predicate;

import static core.aquarium.jellies.Water.*;

public class WaterFiller {
  private static Water water = new Water();
  private static Water water2 = new Water();
  private static final String leftRope;

  static {
    leftRope = "fdfd";
  }

  public void print(float x) {
    System.out.print("float");
  }

  public WaterFiller() {
  }

  public static void main(String[] args) {
    WaterFiller filler = new WaterFiller();
    filler.print(3.44f);

    Predicate<Integer> noGreaterThan5 = x -> x > 5;
    System.out.println(noGreaterThan5.test(4));


  }
}
