package leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()" 输出: true 示例 2:
 *
 * 输入: "()[]{}" 输出: true 示例 3:
 *
 * 输入: "(]" 输出: false 示例 4:
 *
 * 输入: "([)]" 输出: false 示例 5:
 *
 * 输入: "{[]}" 输出: true
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/19 15:06
 */

public class two0 {

  public static void main(String[] args) {
    String s = "";
    boolean valid = isValid(s);
    System.out.println(valid);
  }

  public static boolean isValid(String s) {
    boolean res = false;
    Stack<Character> stack = new Stack<>();
    stack.add('Y');
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        if (stack.peek() == '(') {
          stack.pop();
        } else {
          stack.add(s.charAt(i));
        }
      }
      if (s.charAt(i) == '(') {
        stack.add(s.charAt(i));
      }
      if (s.charAt(i) == ']') {
        if (stack.peek() == '[') {
          stack.pop();
        } else {
          stack.add(s.charAt(i));
        }
      }
      if (s.charAt(i) == '[') {
        stack.add(s.charAt(i));
      }
      if (s.charAt(i) == '}') {
        if (stack.peek() == '{') {
          stack.pop();
        } else {
          stack.add(s.charAt(i));
        }
      }
      if (s.charAt(i) == '{') {
        stack.add(s.charAt(i));
      }
    }
    if (stack.pop() == 'Y') {
      res = true;
    }
    return res;
  }
}
