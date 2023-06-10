package com.tuling.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {

        //1,创建对象
        Collection col = new ArrayList();//可变长度
        //添加元素
        col.add(123);//向上转型,int---->Integer---->Object
        col.add(true);
        col.add("hello");

        //集合的遍历
        //fori
//        for (int i = 0; i < col.size(); i++) {
//           //Collection父接口没有与下标相关的方法
//        }
        //foreach
//        for (Object o : col) {
//            System.out.println(o);
//        }
        //迭代器
        //step1:
        Iterator it = col.iterator();
        //step2:
        while(it.hasNext()){
            //step3:
            Object obj = it.next();
            System.out.println("obj:"+obj);
            //不要在迭代的过程中删除元素
             //col.remove("hello");//java.util.ConcurrentModificationException
            it.remove();
        }

        System.out.println("col:"+col);


//        boolean hasNext = it.hasNext();
//        if(hasNext){
//            Object obj = it.next();
//            System.out.println("obj:"+obj);
//        }
//
//        hasNext = it.hasNext();
//        if(hasNext){
//            Object obj = it.next();
//            System.out.println("obj:"+obj);
//        }
//
//        hasNext = it.hasNext();
//        if(hasNext){
//            Object obj = it.next();
//            System.out.println("obj:"+obj);
//        }

//        hasNext = it.hasNext();//当你判断第4个元素是否的存在的时候，会返回false
//        if(hasNext){
//            Object obj = it.next();
//            System.out.println("obj:"+obj);
//        }
//        Object obj = it.next();//java.util.NoSuchElementException
//        System.out.println("obj:"+obj);
    }
}
