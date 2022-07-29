package leetcode.easy;

public class ValidPalindrome {

  // Time O(n), Space O(n)
  public boolean isPalindrome(String s) {
    s = s.strip().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  // Time O(n), Space O(1)
  public boolean isPalindromeV2(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
        i++;
      }
      while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
        j--;
      }
      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
      i++;
      j--;
    }

    return true;
  }
}
