package codeSeven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName testThread
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-16 18:13
 * @Version 1.0
 **/
public class testThread {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        X x = new X();
        for (int i = 0; i < 100000; i++) {
            service.submit(x);
        }
    }
}

class X extends Thread {
    static StringBuffer str = new StringBuffer("abc");

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();

    }

    public void Y() {
        str.append("1");
        System.out.println(str);
    }
}

class Singleton {
    // 静态属性，volatile保证可见性和禁止指令重排序
    private static Singleton instance = null;

    // 私有化构造器
    private Singleton() {
    }

    public static Singleton getInstance() {
        // 第一重检查锁定
        if (instance == null) {
            // 同步锁定代码块 
            synchronized (Singleton.class) {
                // 第二重检查锁定
                if (instance == null) {
                    // 注意：非原子操作
                    instance = new Singleton();
                    System.out.println(1);
                }
            }
        }
        return instance;
    }
}

