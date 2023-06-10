package com.tuling.part2;

import java.util.ArrayList;
import java.util.List;

class Person{}
class Student extends Person{}
public class Demo2 {

    //？代表可以接收任意类型
    public static void test1(List<?> list){

    }

    public static void test2(List<Object> list){


    }

    //只能放Person 以及Person的子类
    public static void test3(List<? extends Person> list){

    }

    //Person以及Person的父类
    public static void test4(List<? super Person> list){


    }


    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        test1(list1);
        test1(list2);
        test1(list3);

        System.out.println("---------");
        List<Object> list4 = new ArrayList<>();
        test2(list4);

        System.out.println("-------------------------------");

        List<Person> personList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        test3(personList);
        test3(studentList);
        System.out.println("---------------");
        test4(personList);
        //test4(studentList);


    }
}
