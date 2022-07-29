package leetcode.medium;

import java.util.Stack;

public class MinRemoveMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') stack.add(i);
            if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // use a placeholder and erase all of them in the end
                    sb.setCharAt(i, '*');
                }
            }
        }

        // check if stack contains index of '(' without the pair
        while (!stack.empty()) {
            sb.setCharAt(stack.pop(), '*');
        }

         System.out.println(sb.toString());

        return sb.toString().replaceAll("\\*", "");
    }

  public static void main(String[] args) {
    String s = "lee(t(c)o)de)";
    MinRemoveMakeValidParentheses m = new MinRemoveMakeValidParentheses();
    m.minRemoveToMakeValid(s);
  }
}
