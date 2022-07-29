package leetcode.easy;

public class IsPalindrome {

  public static boolean check(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

//  String isPalindrome(String s, int l, int r) {
//      while (l < r) {
//          if ()
//      }
//  }


//  String longestPalindrome(String s) {
//
//  }


  public static void main(String[] args) {
    //
    String s = "abba";
    System.out.println(check(s));
  }
}
