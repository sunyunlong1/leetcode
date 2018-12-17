package DesignPattern.StaticProxy;

/**
 * 客户端.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/15 23:20
 */

public class Cliet {

  public static void main(String[] args) {
    RealStar realStar = new RealStar();
    Star proxyStar = new ProxyStar(realStar);

    proxyStar.qianHeTong();
    proxyStar.sing();
    proxyStar.getMoney();
  }
}
