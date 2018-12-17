package MyQueue;

/**
 * Java实现队列.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 12:26
 */

public class MyQueue<E> {

  /**
   * 队头一端，只允许删除
   */
  private int front;
  /**
   * 队尾一端，只允许插入
   */
  private int rear;

  private int max_size = 16;

  private Object[] data;

  public MyQueue() {
    this(10);
  }

  public MyQueue(int size) {
    if (size < 0) {
      throw new IllegalStateException("创建队列失败" + size + "<0");
    }
    this.max_size = size;
    front = rear = 0;
    data = new Object[size];
  }

  /**
   * 入栈.
   *
   * @param e 入栈的数据
   * @throws ”队列已满“
   * @author sunyunlong5
   * @since 2018/12/17 12:43
   */
  public void push(E e) {
    if (rear == max_size) {
      throw new IllegalStateException("队列已满");
    } else {
      data[rear++] = e;
    }
  }

  /**
   * 判断是否为空.
   *
   * @return boolean
   * @author sunyunlong5
   * @since 2018/12/17 14:04
   */
  public boolean isEmpty() {
    return rear == front ? true : false;
  }

  /**
   * 返回栈顶元素.
   *
   * @return E
   * @author sunyunlong5
   * @since 2018/12/17 14:07
   */
  public E peek() {
    if (isEmpty()) {
      return null;
    } else {
      return (E) data[front];
    }
  }

  /**
   * 返回队列长度.
   *
   * @return int
   * @author sunyunlong5
   * @since 2018/12/17 14:08
   */
  public int length() {
    return rear - front;
  }

  /**
   * 返回栈顶元素并删除.
   *
   * @return int
   * @author sunyunlong5
   * @since 2018/12/17 14:10
   */
  public E pop() {
    if (isEmpty()) {
      throw new IllegalStateException("队列为空");
    } else {
      E e = (E) data[front];
      data[front] = null;
      front++;
      return e;
    }
  }

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push("h");
    queue.push("e");
    queue.push("l");
    queue.push("l");
    queue.push("o");
    int length = queue.length();
    for (int i = 0; i < length; i++) {
      System.out.println(queue.pop());
    }
    // System.out.println(queue.pop());

  }
}
