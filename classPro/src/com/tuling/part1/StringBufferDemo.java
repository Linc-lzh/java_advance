package com.tuling.part1;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //追加
//        sb.append(123);
//        sb.append(true);
//        sb.append("wowoo");
        //链式调用
        sb.append(123).append(true).append("wowowo");
        System.out.println("sb:"+sb.toString());

        sb.insert(3,"hello");

        System.out.println("sb:"+sb.toString());

        System.out.println("--------------------");

        sb.delete(3,8);//包含前面的位置，不包含后面的位置
        System.out.println("sb:"+sb);

        System.out.println("sb的长度："+sb.length());




    }
}
