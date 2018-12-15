package dynamicProxy;

/**
 * 真实角色.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/15 23:19
 */

public class RealStar implements Star {

  @Override
  public void qianHeTong() {
    System.out.println("RealStar.qianHeTong");
  }

  @Override
  public void sing() {
    System.out.println("真正的明星在唱歌！！！！！！！！");
  }

  @Override
  public void getMoney() {
    System.out.println("RealStar.getMoney");
  }
}
