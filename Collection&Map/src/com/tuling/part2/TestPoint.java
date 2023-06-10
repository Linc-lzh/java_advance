package com.tuling.part2;

public class TestPoint {
    public static void main(String[] args) {
        //创建对象的时候，确定了泛型的类型
        Point<Integer> point = new Point<>();
        point.setX(34);
        point.setY(100);

        System.out.println("-----------------");

        Point<String> point2 = new Point<>();
        point2.setX("23");
        point2.setY("32");

        System.out.println("----------------------");

        //定义在方法上的泛型，要在调用方法的时候确定
        Point.getValue("hello,value");
        Point.getValue(100);

    }
}
