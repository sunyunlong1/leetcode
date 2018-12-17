package MinStack;

import java.util.Stack;

/**
 * 实现最小栈，时间复杂度为O(1). 压栈，入栈，最小值功能.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 10:04
 */

public class MinStack {

  private Stack<Integer> stack;
  private Stack<Integer> minStack;

  public MinStack(Stack<Integer> stack, Stack<Integer> minStack) {
    this.stack = stack;
    this.minStack = minStack;
  }

  public void push(int num) {
    if (minStack.isEmpty() || num < getMin()) {
      minStack.pop();
      minStack.push(num);
    }
    stack.push(num);
  }

  public int pop() {
    Integer peek = stack.pop();
    if (getMin().equals(peek)) {
      minStack.pop();
    }
    return peek;
  }

  public Integer getMin() {
    return minStack.peek();
  }
}
