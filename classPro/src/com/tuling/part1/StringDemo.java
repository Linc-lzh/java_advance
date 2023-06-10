package com.tuling.part1;

public class StringDemo {
    public static void main(String[] args) {

        //1,构造函数
        String str = "hello,abc";
        String helloStr = new String("hello");

        /*
        字符数组构建字符串

         */
        char[] charArr = {'c','2','y'};
        String charStr = new String(charArr);
        System.out.println("charStr:"+charStr);

        /*
        字节数组
         */
        byte[] byteArr = {97,98,99,100};
        String byteStr = new String(byteArr,0,2);
        System.out.println("byteStr:"+byteStr);


    }
}
