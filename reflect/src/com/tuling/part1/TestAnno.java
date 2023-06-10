package com.tuling.part1;

import java.lang.reflect.Method;

public class TestAnno {
    public static void main(String[] args) throws NoSuchMethodException {
         /*
        - 在程序使用(解析)注解：获取注解中定义的属性值

        1. 获取注解定义的位置的对象  （Class，Method,Field）

        - isAnnotationPresent(Class)

        1. 获取指定的注解

        - getAnnotation(Class)

        3. 调用注解中的抽象方法获取配置的属性值

         */

        Class<Person> personClass = Person.class;
        //判断是否使用注解
        boolean annotationPresent = personClass.isAnnotationPresent(MyAnno4.class);
        if(annotationPresent){
            //
            MyAnno4 myAnno4 = personClass.getAnnotation(MyAnno4.class);
            int age = myAnno4.age();
            System.out.println("age:"+age);
        }

        //获取定义在方法上的注解
        Method eat = personClass.getMethod("eat");
        boolean annotationPresent2 = eat.isAnnotationPresent(MyAnno4.class);
        if(annotationPresent2){
            MyAnno4 myAnno4 = eat.getAnnotation(MyAnno4.class);
            int age = myAnno4.age();
            System.out.println("方法上的age:"+age);
        }


    }
}
