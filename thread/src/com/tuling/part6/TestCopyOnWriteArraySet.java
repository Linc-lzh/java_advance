package com.tuling.part6;


import java.util.concurrent.CopyOnWriteArraySet;

public class TestCopyOnWriteArraySet {
    public static void main(String[] args) {
//1创建集合
        CopyOnWriteArraySet<String> set=new CopyOnWriteArraySet<>();
        //2添加元素
        set.add("pingguo");
        set.add("huawei");
        set.add("xiaomi");
        set.add("lianxiang");
        set.add("pingguo");
        //3打印
        System.out.println("元素个数:"+set.size());
        System.out.println(set.toString());
    }
}
