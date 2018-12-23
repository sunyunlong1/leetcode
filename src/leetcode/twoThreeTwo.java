package leetcode;

import java.util.Iterator;
import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 示例:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 * 说明:
 *
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/20 15:40
 */

public class twoThreeTwo {

  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  /** Initialize your data structure here. */
  public twoThreeTwo() {

  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    stack1.push(x);

  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if(stack2.empty()) {
      while(!stack1.empty()){
        stack2.push(stack1.pop());
      }
      return stack2.pop();
    }else{
      return stack2.pop();
    }
  }

  /** Get the front element. */
  public int peek() {
    if(stack2.empty()){
      while(!stack1.empty()){
        stack2.push(stack1.pop());
      }
      return stack2.peek();
    }else{
      return stack2.peek();
    }
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
      if(stack2.empty()){
        return stack1.empty();
      }else{
        return false;
      }
  }

  public static void main(String[] args) {

    twoThreeTwo queue = new twoThreeTwo();
    queue.push(1);
    queue.push(2);
    System.out.println(queue.peek());
    System.out.println(queue.pop());
    System.out.println(queue.empty());


  }
}
