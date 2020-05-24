package byteDance;

import java.util.ArrayList;
import java.util.List;

public class shuchukuohao {

    public static void main(String[] args) {
        List<String> strings=generateParenthesis(3);
        System.out.println(strings);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        getResult(list,str,0,0,n);
        return list;
    }

    public static void getResult(List<String> list, StringBuilder str, int left, int right, int n){
        if(left + right  == 2*n){
            list.add(str.toString());
            return;
        }
        if(left < n){
            str.append("(");
            getResult(list,str,left+1,right,n);
            str.deleteCharAt(str.length() - 1);
        }
        if(left > right){
            str.append(")");
            getResult(list,str,left,right+1,n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
