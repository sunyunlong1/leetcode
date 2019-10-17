package codeSeven;

/**
 * @ClassName TestStart
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-17 14:28
 * @Version 1.0
 **/
public class TestStart {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        //demo.setDaemon(true);
        demo.start();
        System.out.println("main is exit");
        System.exit(0);
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i= 0;i<100;i++){
            System.out.println("This is a Thread test"+i);
        }
    }
}
