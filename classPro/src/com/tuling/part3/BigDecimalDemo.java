package com.tuling.part3;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println("(d1-d2):"+(d1-d2));
        System.out.println("(d1+d2):"+(d1+d2));
        //对于精度要求很高double,无法精确
        //用BigDecimal
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");
        //加减乘除
        BigDecimal add = b1.add(b2);
        System.out.println("add.doubleValue():"+add.doubleValue());
        BigDecimal subtract = b1.subtract(b2);
        System.out.println("subtract.doubleValue():"+subtract.doubleValue());
        BigDecimal multiply = b1.multiply(b2);
        System.out.println("multiply.doubleValue():"+multiply.doubleValue());

        BigDecimal b3 = new BigDecimal("3");
        BigDecimal divide = b1.divide(b3,2,BigDecimal.ROUND_UP);

        System.out.println("divide.doubleValue():"+divide.doubleValue());


    }
}
