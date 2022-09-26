package core;

import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Logger;

public class NumberFormatTest {

  public static double round(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }

  public static void main(String[] args) {
    double d = 4.333333;
    System.out.println(round(d, 2));

    int random = new Random().nextInt(10);
    System.out.println(random);

    float ranF = new Random().nextFloat();
    System.out.println(ranF);

    long ranD = new Random().nextLong();

    Long l1 = 127L;
    Long l2 = 127L;
    System.out.println(l1 == l2);
    Long l3 = 128L;
    Long l4 = 128L;
    System.out.println(l3 == l4);

    Long l5 = null;
    Long l6 = 100L;
//    System.out.println(l5.equals(l6)); // NullPointer
    System.out.println(Objects.equals(l5, l6)); // null-safe
    System.out.println(l6.longValue());

    Date date = new Date();
  }
}
