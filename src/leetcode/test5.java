package leetcode;

import java.math.BigDecimal;
import java.util.*;

public class test5 {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("tom",new BigDecimal(""+new Integer(2833)));
        Map<String,Object> map2 = new HashMap<>();
        map2.put("tom",new BigDecimal(20443.52));
        Map<String,Object> map3 = new HashMap<>();
        map3.put("tom",new BigDecimal(1742.60));
        Map<String,Object> map4 = new HashMap<>();
        map4.put("tom",new BigDecimal(37289.84));

        Map<String,Object> map5 = new HashMap<>();
        map5.put("tom",new BigDecimal(256.30));

        Map<String,Object> map6 = new HashMap<>();
        map6.put("1234","asnjdak");

        list.add(map);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);

        for (Map<String,Object> mapTest :list){
            System.out.println(mapTest.get("tom"));
        }

        paixu(list,"tom");

        System.out.println("-----------");
        for (Map<String,Object> mapTest :list){
            System.out.println(mapTest.get("tom"));
        }

    }

    private static void paixu(List<Map<String,Object>> list,String str){
        Collections.sort(list, new Comparator<Map<String, Object>>(){
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                BigDecimal name1 =(BigDecimal)o1.get(str);//name1是从你list里面拿出来的一个
                BigDecimal name2= (BigDecimal)o2.get(str); //name1是从你list里面拿出来的第二个name
                return -name1.compareTo(name2);
            }

        });
    }
}
