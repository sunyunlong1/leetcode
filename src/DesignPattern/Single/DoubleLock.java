package DesignPattern.Single;

/**
 * 双检索单例模式.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 14:25
 */

public class DoubleLock {

  private static DoubleLock instance = null;

  private DoubleLock() {
    if (instance != null) {
      throw new RuntimeException();
    }
  }

  public static DoubleLock getInstance() {
    if (instance == null) {
      synchronized (DoubleLock.class) {
        if (instance == null) {
          instance = new DoubleLock();
        }
      }
    }
    return instance;
  }
}
