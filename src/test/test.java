package test;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
//        Student student = new Student();
//        test4("12", student);
//        System.out.println(student.getAge()+student.getName());
//        Integer sum = new Integer(500);
//        test5(sum);
//        System.out.println(sum);
//        String str = "!23";
//
//        System.out.println(test6(str));
//
//        int[] arrays = {4,1,1,1};
//        test7(arrays);
//        System.out.println(arrays[0]);

        BigDecimal b1 = new BigDecimal(0.12);

        System.out.println(divideByPercent(b1,BigDecimal.ZERO));
    }

    private static void test4(String s,Student stu){
        stu.setAge("12");
        stu.setName("tom");
        //return stu;
    }

    private static void test5(Integer integer){
        integer = 300;
    }

    private static String test6(String s){
        s = "avc";
        return s;
    }

    private static void test7(int[] arrays){
        arrays[0] = 1;
    }


    public static BigDecimal divideByPercent(BigDecimal p1, BigDecimal p2) {
        if(p1 == null || p2 == null || p2.compareTo(BigDecimal.ZERO) == 0){
            return new BigDecimal("0.00");
        }
        return p1.multiply(new BigDecimal(100)).divide(p2.abs(), 2, BigDecimal.ROUND_HALF_UP);
    }
}
