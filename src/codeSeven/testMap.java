package codeSeven;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName testMap
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-16 16:09
 * @Version 1.0
 **/
public class testMap {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("123",1);
        map.put("123",3);
        X(map);
        System.out.println(map.get("123"));

    }

    static void X(Map<String,Object> map){
        map.put("123",6);
    }
}
