package com.tuling.part3;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("123");
        list.addFirst("234");
        list.addLast("hello");
        list.addLast("true");



        System.out.println("list:"+list);

        System.out.println("--------------");

        System.out.println("弹出一个元素："+list.pop());

        System.out.println("弹出一个元素之后打印："+list);

    }
}
