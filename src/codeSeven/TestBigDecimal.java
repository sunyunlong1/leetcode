package codeSeven;

import java.math.BigDecimal;

/**
 * @ClassName TestBigDecimal
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-29 17:15
 * @Version 1.0
 **/
public class TestBigDecimal {

    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(0.00);
        BigDecimal b2 = new BigDecimal(0.00);
        BigDecimal b3 = new BigDecimal("0.00");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("--------------");
        System.out.println("equals比较");
        System.out.println(contrast1(b1,b2));
        System.out.println(contrast1(b1,b3));
        System.out.println(contrast1(b2,b3));
        System.out.println(contrast1(b1,BigDecimal.ZERO));
        System.out.println(contrast1(b2,BigDecimal.ZERO));
        System.out.println(contrast1(b3,BigDecimal.ZERO));

        System.out.println("--------------");

        System.out.println("compareTo比较");
        System.out.println(contrast2(b1,b2));
        System.out.println(contrast2(b1,b3));
        System.out.println(contrast2(b2,b3));
        System.out.println(contrast2(b1,BigDecimal.ZERO));
        System.out.println(contrast2(b2,BigDecimal.ZERO));
        System.out.println(contrast2(b3,BigDecimal.ZERO));

    }

    public static boolean contrast1(BigDecimal b1,BigDecimal b2){
        return b1.equals(b2);
    }

    public static int contrast2(BigDecimal b1,BigDecimal b2){
        return b1.compareTo(b2);
    }

}
