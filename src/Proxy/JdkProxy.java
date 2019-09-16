package Proxy;

import codeSeven.Person;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkProxy
 * @Decription TODO
 * @Auther mac
 * @Date 2019-09-06 11:02
 * @Version 1.0
 **/
public class JdkProxy implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理监听开始");
        Object invoke = method.invoke(target, args);
        System.out.println("jdk动态代理监听结束");
        return invoke;
    }

    private Object getJDKProxy(Object targetObject){
        this.target = targetObject;
        System.out.println(targetObject.getClass().getClassLoader());
        System.out.println(targetObject.getClass().getName());
        Object o = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
        return o;
    }

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        JdkProxy jdkProxy = new JdkProxy();
        UserManager u = (UserManager)jdkProxy.getJDKProxy(new UserManagerImpl());
        u.addUser("tom","123");

        u.delUser("123","tom");
    }
}
