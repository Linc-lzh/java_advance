package com.tuling.part4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加
        set.add("hello");
        set.add("world");
        set.add("张三");
        set.add("张三");//无法放入重复的元素
        System.out.println("set:"+set);

        //遍历
        for (String s : set) {
            System.out.println("s:"+s);
        }
        System.out.println("--------------------");
        //迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println("next:"+next);
        }

        System.out.println("-------------------------------");

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(3);
        System.out.println("set2:"+set2);

        //自定义类型:如果希望自定义类型，的成员相同的时候，不要重复添加到Set集合，那么应该重写hashCode()和equals()方法
        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat("hellokity1",2));
        catSet.add(new Cat("hellokity2",4));
        catSet.add(new Cat("hellokity1",2));

        System.out.println("catSet:"+catSet);
    }
}
