package com.tuling.part1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //
        Class<Person> personClass = Person.class;

//        Constructor<?>[] getConstructors():获取所有公共public修饰的构造函数
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------");
//        Constructor<T> getConstructor(Class<?>... parameterTypes）获取指定的public修饰的构造函数
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        //用反射的方式创建对象
        Person tuling = constructor.newInstance("tuling", 23);
        System.out.println(tuling);

        //获取无参构造
//        Constructor<Person> noargsConstructor = personClass.getConstructor();
//        Person person = noargsConstructor.newInstance();
        Person person = personClass.newInstance();
        System.out.println(person);

        System.out.println(constructor);

        System.out.println("------------------");
//        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
//        Constructor<?>[] getDeclaredConstructors() 获取所有声明过的构造函数
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }


    }
}
