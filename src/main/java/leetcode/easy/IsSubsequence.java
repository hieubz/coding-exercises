package leetcode.easy;

public class IsSubsequence {

  public static boolean isSubsequence(String s, String t) {
    int i = 0;
    for (Character c : t.toCharArray()) {
      if (i == s.length()) return true;
      if (c == s.charAt(i)) {
        i++;
      } else {
        return false;
      }
    }
    return i == s.length();
  }

  public static void main(String[] args) {
    String s = "abc";
    String t = "abdd";
    System.out.println(isSubsequence(s, t));
  }
}
