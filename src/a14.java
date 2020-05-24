import java.util.HashMap;
import java.util.Map;

public class a14 {

    static Map<String,Integer> map = new HashMap<>();
    static{
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

    }
    public static int romanToInt(String s) {
        if(s == null) return 0;
        s = s + " ";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            String key = s.substring(i,i+1);
            String key2 = "";
            if(key.equals("I") || key.equals("X") || key.equals("C")){
                key2 = s.substring(i,Math.min(i+2,s.length()));
            }
            if(map.get(key2) != null){
                sum += map.get(key.toString());
                i++;
                continue;
            }
            if(map.get(key) != null){
                sum += map.get(key.toString());
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
