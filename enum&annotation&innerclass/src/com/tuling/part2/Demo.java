package com.tuling.part2;

import java.util.Date;

@SuppressWarnings("all")
class Person{
    public void eat(){}
}


class Student extends Person{
    @Override//约束下面的方法声明符合重写的要求
    public void eat() {

    }

    @Deprecated
    public String test(){
        return null;
    }


}

@SuppressWarnings("all")
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("年："+date.getYear());
        System.out.println(new Student().test());

    }
}
