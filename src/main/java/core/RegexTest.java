package core;

import java.util.regex.Pattern;

public class RegexTest {
  private static final Pattern DATE_PATTERN =
      Pattern.compile("^[0-9]{4}[-/][0-9]{2}[-/][0-9]{2}$");

  public static void main(String[] args) {
    String date = "2022-08-31";
    String date2 = "2022/08/31";
    System.out.println(DATE_PATTERN.matcher(date).matches());
    System.out.println(DATE_PATTERN.matcher(date2).matches());
  }
}
