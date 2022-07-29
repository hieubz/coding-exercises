package leetcode.medium;

public class LongestPalindromicSubString {

    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    // the length of the palindrome may be odd or even => I use two pointers that spreads from the center to both sides
    // if the length is odd, it has one central character
    // if the length is even, it have two central character

    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() < s1.length() ? s1 : res;
            res = res.length() < s2.length() ? s2 : res;
        }
        return res;
    }
}
