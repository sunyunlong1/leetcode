package DesignPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/15 23:25
 */

public class ProxyHandler implements InvocationHandler {

  private RealStar realStar;
  private ProxyStar proxyStar;

  public ProxyHandler(RealStar realStar, ProxyStar proxyStar) {
    this.realStar = realStar;
    this.proxyStar = proxyStar;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object obj = null;

    if(method.getName().equals("sing")){
      obj = method.invoke(realStar, args);
    }else{
      obj = method.invoke(proxyStar,args);
    }

    return obj;
  }
}
