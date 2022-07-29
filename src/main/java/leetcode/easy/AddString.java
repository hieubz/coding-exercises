package leetcode.easy;

public class AddString {

      public String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
          return num2;
        }
        if (num2.length() == 0) {
          return num1;
        }

        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (p1 >= 0 || p2 >= 0) {
          int digit1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
          int digit2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
          int sum = carry + digit1 + digit2;
          ans.append(sum % 10);
          carry = sum / 10;
          p1 -= 1;
          p2 -= 1;
        }

        return ans.reverse().toString();
      }
}
