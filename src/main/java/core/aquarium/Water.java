package core.aquarium;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Water {


  private Integer method() {
    return null;
  }

  public void moreC(String values, int... nums) {}


  public static void main(String[] args) {
    int i1 = 1_234;
    System.out.println(i1);

    int x = 4;
    long y = x * 4 - x++;
    System.out.println(x);
    System.out.println(y);
    System.out.println(true ^ false);

    boolean b = false;
    if(b = true) System.out.println("Success");

    String roar1 = "roar";
    StringBuilder roar2 = new StringBuilder("roar");
    roar1.concat("!!!");
    System.out.println(roar1);

    String beans[] = new String[6];
    int[] arr = new int[5];

    char[]n = new char[2];
    System.out.println(n.length);

    ArrayList l = new ArrayList();

    int[] random = { 6, -4, 12, 0, -10 };
    int t = 12;
    int g = Arrays.binarySearch(random, t);
    System.out.println(y);

    String [] names = {"Tom", "Dick", "Harry"};
    List<String> list = Arrays.asList(names);
    names[0] = "sue";
    System.out.println(names[0]);


    Period p = Period.of(1, 2, 3);
    LocalDateTime d = LocalDateTime.of(2014, 5, 10, 11, 2, 10);

    Duration du = Duration.ofDays(1);
    System.out.println(du.getSeconds());

    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(d.format(f));

    Period xx = Period.ofDays(1).ofYears(2);
    System.out.println(xx.getYears());
  }
}
