package core;

public class StringTest {

  public static void main(String[] args) {
    String a = "aa";
    String b = "aa";
    System.out.println(a == b);

    String name = "Fluffy";
    String name2 = new String("Fluffy");
    System.out.println(name.replace("f", "x"));
    System.out.println(name.replaceAll("^[A-Za-z]*(f)[A-Za-z]*$", "x"));

    // use String format
    double value = 4.3333333;
    String s = String.format("%.2f test string", value);
  }
}
