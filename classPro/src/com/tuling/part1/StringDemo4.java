package com.tuling.part1;

public class StringDemo4 {
    public static void main(String[] args) {

        //这里发生的是，字符串常量池当中产生了2个字符串
//        String str = "234";
//        str +="abc";
//        System.out.println("str:"+str);
//
//        str += "hello";
//        System.out.println("str:"+str);

        //StringBuffer,StringBuilder

        System.out.println("-------------------------------");
        
        //
//        long start = System.currentTimeMillis();//当前时间的毫秒数
//        String str = "";
//        for (int i = 0; i < 9999; i++) {
//            str +=i;
//        }
//        System.out.println(str);
//        long end = System.currentTimeMillis();
//        System.out.println("用String类持续的时间："+(end-start));
        System.out.println("-------------------------------");
        long startNew = System.currentTimeMillis();//当前时间的毫秒数
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 9999; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long endNew = System.currentTimeMillis();
        System.out.println("用StringBuffer持续的时间："+(endNew-startNew));



        


    }
}
