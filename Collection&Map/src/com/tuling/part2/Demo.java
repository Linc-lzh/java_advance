package com.tuling.part2;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {

        //1,创建对象
        Collection<Integer> col = new ArrayList();//可变长度
        //添加元素
        col.add(123);//向上转型,int---->Integer---->Object
//        col.add(true);
//        col.add("hello");
        col.add(23);
        //col.add(34.4);
        //遍历
        int sum = 0;
        for (Object o : col) {
//            if(o instanceof Integer){//判断一下类型，需要向下转型，效率低下。容易产生错误
//
//            }
            Integer num  = (Integer)o;
            sum +=num;
        }
        System.out.println("所有数字的和："+sum);




    }
}
