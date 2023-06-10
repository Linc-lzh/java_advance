package com.tuling.part6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("cccc");
        list.add("2");
        list.add("ddd");

        //工具类的常用方法
        Collections.addAll(list,"hello","world");
        System.out.println("list:"+list);

        //排序
        Collections.sort(list);
        System.out.println("排序之后："+list);

        //搜索
        int index = Collections.binarySearch(list, "ddd");
        System.out.println("index:"+index);

        //反转
        Collections.reverse(list);
        System.out.println("反转之后list:"+list);


    }
}
