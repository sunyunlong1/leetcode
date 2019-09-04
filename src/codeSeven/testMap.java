package codeSeven;

import java.util.*;

/**
 * @ClassName testMap
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-16 16:09
 * @Version 1.0
 **/
public class testMap {
    public static void main(String[] args) {
//        Map<String,Object> map = new HashMap<>();
//        map.put("123",1);
//        map.put("123",3);
//        X(map);
//        System.out.println(map.get("123"));


//        String s = new String("123");
//
//        String s1 = "123";
//        System.out.println(s == s1);
//
//        String s2 = new String("1234").intern();
//        String s3 = "1234";
//
//        System.out.println(s2 == s3);
//
//        String s4 = new String("12334");
//        System.out.println(s4.intern() == s4);

//        String str2 = "SEUCalvin";//新加的一行代码，其余不变
//
//        String str1 = new String("SEU")+ new String("Calvin");
//        System.out.println(str1.intern() == str1);
//        System.out.println(str1 == "SEUCalvin");


        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.show(a);
        a.show(b);
        b.show(c);
        b.show(d);

        A ba = new B();
        ba.show(c);
        ba.show(d);

        ba.show(a);

        List<Object> objects = Collections.emptyList();

        List list = new ArrayList(objects);
        list.add(123);
        System.out.println(list.get(0));
    }

    static void X(Map<String,Object> map){
        map.put("123",6);
    }
}

class A{
    public void show(A obj){
        System.out.println("A.show(A)");
    }

    public void show(C obj){
        System.out.println("A.show(C)");
    }
}
class B extends A{

    @Override
    public void show(A obj){
        System.out.println("B.show(A)");
    }
}

class C extends B{

}

class D extends C{

}
