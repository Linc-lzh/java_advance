package com.tuling.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Person{}

public class CollectionDemo {
    public static void main(String[] args) {
        //1,创建对象
        Collection col = new ArrayList();//可变长度
        //添加元素
        col.add(123);//向上转型,int---->Integer---->Object
        col.add(true);
        col.add("hello");
        col.add(new Person());

        Collection subCol = new ArrayList();
        subCol.add("1");
        subCol.add("2");

        col.addAll(subCol);//添加一个集合
        System.out.println("col:"+col);

        //清空
        //col.clear();
        System.out.println("清空之后col:"+col);

        //是否包含某个元素
        boolean contains = col.contains("hello1");
        System.out.println("是否包含contains:"+contains);
        //equals
        Collection subCol2 = new ArrayList();
        subCol2.add("1");
        subCol2.add("2");
        boolean equals = subCol.equals(subCol2);//说明比较的是内容
        System.out.println("两个集合是否相等："+equals);

//        col.clear();
//        System.out.println("是否为空："+col.isEmpty());
        //删除某个元素
        col.remove("1");
        System.out.println("删除元素之后："+col);
        System.out.println("集合里面有多少个元素："+col.size());

        //集合转数组
        Object[] objects = col.toArray();
        System.out.println("集合转数组："+ Arrays.toString(objects));


    }
}
