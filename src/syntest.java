public class syntest {

    public static boolean flag = false;

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                String name=Thread.currentThread().getName();
//                System.out.println(name+"开始执行");
                    while(!flag){
                        System.out.println("执行中");
                    }
                    if(flag){
                        System.out.println("改变了");
                    }
                }
//                System.out.println(name+"执行完毕");

        }
        ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
                flag = true;
            }
        }
        ).start();
    }


}
