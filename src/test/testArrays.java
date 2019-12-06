package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName testArrays
 * @Decription TODO
 * @Auther mac
 * @Date 2019-12-05 15:55
 * @Version 1.0
 **/
public class testArrays {

    public static void main(String[] args) {
//        int[] a = {3,8,1,6,0,2,4,7,5,9};
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

        double loarn = Loarn(51, 2, 51);
        System.out.println(loarn);
    }

    public static double Loarn(int n,double value,int base){
        return n * (Math.log(base)/Math.log(value));
    }
}
