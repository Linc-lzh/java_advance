package com.tuling.part1;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();//传统的


        
        //1,第一步要获取Class类的对象
        Class<Person> personClass = Person.class;
        /*
        Field[] getFields() ：获取所有public修饰的成员变量
Field getField(String name)   获取指定名称的 public修饰的成员变量
Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
Field getDeclaredField(String name)
         */
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //
        System.out.println("-----------------------");
        Field i = personClass.getField("i");
//        p.i = 123;
//        System.out.println("i的值："+p.i);
        //设值
        i.set(p,123);
        System.out.println("i的值："+i.get(p));



        System.out.println("i:"+i);
        System.out.println("----------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("---------------------");
        Field name = personClass.getDeclaredField("name");
        //忽略访问修饰符的检查
        name.setAccessible(true);
        //设值
        name.set(p,"tuling");
        //取值
        System.out.println("name的值："+name.get(p));

        System.out.println("name:"+name);

        System.out.println("==================================>");




    }
}
