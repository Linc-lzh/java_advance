package com.tuling.part5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,String> map =  new HashMap<>();

        //添加元素:key 要唯一
        map.put("台湾","周杰伦");
        map.put("香港","刘德华");
        map.put("大陆","黄渤");

        map.put("大陆","黄磊");

        System.out.println("map:"+map);

        System.out.println("map.get(\"香港\"):"+map.get("香港"));

        //
        boolean result = map.containsKey("香港1");
        System.out.println("是否包含这个key:"+result);

        //删除元素
        //map.remove("香港");
        //System.out.println("删除之后的map:"+map);

        System.out.println("----------------------------");
        //遍历1
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("----------------------------");
        //遍历2：
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getKey());
        }


        //HashMap
        Map<String,Integer> newMap = new HashMap<>();
        newMap.put("aaaa",1);
        newMap.put("dddd",4);
        newMap.put("cccc",1);
        newMap.put("bb",4);
        System.out.println("newMap:"+newMap);



    }
}
