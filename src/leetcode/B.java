package leetcode;

/**
 * Description.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/19 20:07
 */

public class B extends A {

  @Override
  public void sing() {
    System.out.println("hhah");
  }

  public static void main(String[] args) {
    A a = new A() {
      @Override
      public void sing() {
        System.out.println("song");
      }
    };
    a.sing();

    A a1 = new B();
    a1.sing();
    a1.sun();
  }
}
