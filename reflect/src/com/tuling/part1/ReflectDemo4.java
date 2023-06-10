package com.tuling.part1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1,
        Class<Person> personClass = Person.class;

//        Method[] getMethods()  :获取类里面所有的public方法，包括父类里面的public方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-----------------------------");


//        Method getMethod(String name, 类<?>... parameterTypes)
//        Method eat = personClass.getMethod("eat");
//        System.out.println(eat);
//        Person person = personClass.newInstance();
//        //调用方法
//        eat.invoke(person);

        Method eat = personClass.getMethod("eat", int.class);
        Person person = personClass.newInstance();
        Object result = eat.invoke(person, 3);
        System.out.println("result:"+result);


        System.out.println("---------------------");

//        Method[] getDeclaredMethods()  :获取类里面声明的所有的方法，不包括父类的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
//        Method getDeclaredMethod(String name, 类<?>... parameterTypes)




    }
}
