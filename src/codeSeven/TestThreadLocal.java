package codeSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName TestThreadLocal
 * @Decription TODO
 * @Auther mac
 * @Date 2019-09-21 16:41
 * @Version 1.0
 **/
public class TestThreadLocal {

    private final static Executor executor = Executors.newCachedThreadPool();//启用多线程


    public static void main(String[] args) {
//        System.out.println("多线程开始:"+System.currentTimeMillis());
//        for (int i = 0; i < 10000; i++) {
//
//            ThreadDemo t = new ThreadDemo(i);
//
////            for (int j = 0 ;j<10;j++){
////                new Thread(t).run();
////            }
//            final int j = i;
//            executor.execute(new Thread() {
//                @Override
//                public void run() {
//                    System.out.println(j);
//                }
//            });
//        }
//        System.out.println("多线程结束:"+System.currentTimeMillis());

        ExecutorService ex = Executors.newFixedThreadPool(5);

        List<Future<Object>> futures = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {

           ex.submit(new ThreadDemo(i));

        }

        ex.shutdown();

//        System.out.println("--------------------------------");
//
//        System.out.println("开始:"+System.currentTimeMillis());
//        for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
//        }
//        System.out.println("结束:"+System.currentTimeMillis());
    }


    static class ThreadDemo extends Thread{

        private Integer i;

        ThreadDemo(){

        }

        ThreadDemo(Integer i){
            this.i = i;
        }

        @Override
        public void run() {
            sout(i);
        }
    }


    private static void sout(Integer i){
        System.out.println("打印"+i);
    }
}
