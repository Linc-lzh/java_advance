package com.tuling.part4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        //可以有序，去重
        Set<String> set = new TreeSet<>();
        set.add("aaaa");
        set.add("bbbb");
        set.add("dddd");
        set.add("cccc");

        System.out.println("set:"+set);
        System.out.println("---------------------");
        Set<Integer> set2 = new TreeSet<>();
        set2.add(111);
        set2.add(222);
        set2.add(1);
        set2.add(2);
        set2.add(2);

        System.out.println("set2:"+set2);

        System.out.println("-------------------------------");
        Set<Cat> catSet = new TreeSet<>();
        catSet.add(new Cat("hellokity3",40));
        catSet.add(new Cat("hellokity2",40));//添加第二个元素的时候，
        catSet.add(new Cat("hellokity1",60));

        System.out.println("catSet:"+catSet);


        System.out.println("================================");

        Set<Cat> catSet2 = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getAge()>o2.getAge()){
                    return -1;
                }else if(o1.getAge()<o2.getAge()){
                    return 1;
                }
                return -(o1.getName().compareTo(o2.getName()));
            }
        });
        catSet2.add(new Cat("hellokity3",40));
        catSet2.add(new Cat("hellokity2",40));//添加第二个元素的时候，
        catSet2.add(new Cat("hellokity1",60));

        System.out.println("catSet2:"+catSet2);

    }
}
