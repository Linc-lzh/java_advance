package com.tuling.part3;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建对象
        List<Integer> list = new ArrayList<>();
        //添加元素,有序，可重复
        list.add(0,100);
        list.add(1,100);
        list.add(2,20);
        list.add(3,200);
        System.out.println("list:"+list);
        //获取元素
        Integer ele = list.get(2);
        System.out.println("ele:"+ele);
        //修改
        list.set(2,1000);
        System.out.println("修改之后的list集合："+list);
        //删除
        list.remove(2);
        System.out.println("删除之后list:"+list);

        System.out.println("-------------------------------------------------");





    }
}
