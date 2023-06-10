package com.tuling.part1;

public class StringDemo3 {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = new String("abcd");
        System.out.println("str1==str2:"+(str1==str2));//内存地址一样吗？

        System.out.println("--------------------------------");

        String str3 = "ab";
        String str4 = "cd";
        String newStr = str3+str4;//new StringBuilder().append(str).append(str3).toString()
        System.out.println("str1==newStr:"+(str1==newStr));

        System.out.println("---------------------------------");

        String newStr2 = "ab"+"cd";//拼接之后就是"abcd",就是字符串里面的地址，而字符串常量池里面就只有一份数据
        System.out.println("str1==newStr2:"+(str1==newStr2));

        String str5 = "cd";
        String newStr3 = "ab"+str5;//--->
        System.out.println("str1==newStr3:"+(str1==newStr3));




    }
}
