package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 客户端.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/15 23:27
 */

public class Client {

  public static void main(String[] args) {
    RealStar realStar = new RealStar();

    ProxyStar proxyStar = new ProxyStar(realStar);

    ProxyHandler handler = new ProxyHandler(realStar,proxyStar);

    Star o = (Star) Proxy
        .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

    o.qianHeTong();
    o.sing();
    o.getMoney();

  }
}
