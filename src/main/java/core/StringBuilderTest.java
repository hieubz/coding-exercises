package core;

public class StringBuilderTest {

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    s.append("100");
    s.append("333");
    System.out.println(s.toString());
    s.setLength(0);
    System.out.println(s.toString());
  }
}
