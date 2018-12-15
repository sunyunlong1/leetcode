package dynamicProxy;

/**
 * 代理角色.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/15 23:16
 */

public class ProxyStar implements Star {

  private RealStar realStar;

  public ProxyStar(RealStar realStar) {
    this.realStar = realStar;
  }

  @Override
  public void qianHeTong() {
    System.out.println("ProxyStar.qianHeTong");
  }

  @Override
  public void sing() {
      realStar.sing();
  }

  @Override
  public void getMoney() {
    System.out.println("ProxyStar.getMoney");
  }
}
