package leetcode.easy;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Stack;

public class ValidParentheses {

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '{') {
        stack.push('}');
      } else if (c == '[') {
        stack.push(']');
      } else {
        if (stack.isEmpty() || stack.pop() != c) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime past = LocalDateTime.of(2022, 4, 20, 0, 0);
    Integer months = (int) ChronoUnit.MONTHS.between(YearMonth.from(past), YearMonth.from(now));
    System.out.println(months);
  }
}
