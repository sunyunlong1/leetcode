package Proxy;

/**
 * @ClassName UserManagerImpl
 * @Decription TODO
 * @Auther mac
 * @Date 2019-09-06 11:00
 * @Version 1.0
 **/
public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userName, String passWord) {
        System.out.println("调用addUser方法");
        System.out.println("传入参数userName="+userName+",passWord="+passWord);
    }

    @Override
    public void delUser(String userName, String passWord) {
        System.out.println("调用delUser方法");
        System.out.println("传入参数userName="+userName+",passWord="+passWord);
    }
}
