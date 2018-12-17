package DesignPattern.Single;

import java.util.concurrent.CountDownLatch;

/**
 * 通过反射方式跳过单例.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 14:41
 */

public class Main {

  public static void main(String[] args) throws Exception {
//    DoubleLock instance = DoubleLock.getInstance();
//    DoubleLock instance1 = DoubleLock.getInstance();
//    System.out.println(instance == instance1);
//
//    Class<DoubleLock> clazz = (Class<DoubleLock>) Class.forName("DesignPattern.Single.DoubleLock");
//
//    Constructor<DoubleLock> c = clazz.getDeclaredConstructor(null);
//    c.setAccessible(true);
//    DoubleLock doubleLock = c.newInstance();
//    DoubleLock doubleLock1 = c.newInstance();
//    System.out.println(doubleLock == doubleLock1);

    long start = System.currentTimeMillis();

    int count = 10;
    CountDownLatch countDownLatch = new CountDownLatch(count);

    for (int i = 0; i < 10; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          for (int i = 0; i < 100000; i++) {
            DoubleLock instance = DoubleLock.getInstance();
          }
          countDownLatch.countDown();
        }
      }).start();
    }
    countDownLatch.await();//main线程阻塞，直到计数器为0，才会继续往下执行

    long end = System.currentTimeMillis();
    System.out.println("总耗时" + (end - start));
  }
}
