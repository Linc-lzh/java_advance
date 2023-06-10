package com.tuling.part4;

import java.util.Arrays;
class Student{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象垃圾回收之前调用了...");
    }
}


public class TestSystem {
    public static void main(String[] args) {
        //
        int[] arr = {34,23,12,56,84};
        int[] newArr = new int[5];

        //1 arraycopy：数组的复制
        //src：源数组
        //srcPos:从那个位置开始复制 0
        //dest：目标数组
        //destPos:目标数组的位置
        //length：复制的长度
        System.arraycopy(arr,2,newArr,0,3);
        System.out.println(" Arrays.toString(newArr):"+ Arrays.toString(newArr));

        //2,System.currentTimeMillis();

        //3,
        new Student();
        new Student();
        new Student();
        //3回收垃圾
        System.gc();

        //4退出jvm
        System.exit(0);

        System.out.println("hello,world!!");
        System.out.println("hello,world!!");
        System.out.println("hello,world!!");





    }
}
