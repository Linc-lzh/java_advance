package com.tuling.part5;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //key会自动排序，要实现comparable接口
        Map<String,Integer> map = new TreeMap<>();
        map.put("aaaa",23);
        map.put("bb",23);
        map.put("dddd",23);
        map.put("cccc",23);

        System.out.println("map:"+map);



    }
}
