package PrimeNum;

/**
 * 用多线程求1-1000000的质数.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 9:41
 */

public class Prime {

  public static void main(String[] args) {
    Thread thread = new MyThread(0, 200000);
    Thread thread1 = new MyThread(200000, 400000);
    Thread thread2 = new MyThread(400000, 600000);
    Thread thread3 = new MyThread(600000, 800000);
    Thread thread4 = new MyThread(800000, 1000000);
    thread.start();
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
  }

}

class MyThread extends Thread {

  private int start;
  private int end;
  private static volatile int sum = 0;

  public MyThread(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public void run() {
    for (int i = start; i < end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        sum++;
      }
    }
    System.out.println("共有" + sum + "个质数");
  }

  private boolean isPrime(int num) {
    boolean result = false;
    if (num < 2) {
      return result;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return result;
      }
    }
    result = true;
    return result;
  }
}