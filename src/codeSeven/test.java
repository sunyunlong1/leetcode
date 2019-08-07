package codeSeven;

import java.util.Random;

/**
 * @ClassName test
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-07 18:02
 * @Version 1.0
 **/
public class test {

    public static void main(String[] args) {
        Random world =  new Random();

        Person you = new Person(),me = new Person();

        final Integer life  = 100;
        int i = 0;
        do{
            you.setLocation(world.nextInt(life));
            me.setTarget(world.nextInt(life));
            System.out.println(i++);
        }while(me.getTarget() != you.getLocation());
        System.out.println("stop");
        you.eye = me;
        me.heart = you;
    }
}
