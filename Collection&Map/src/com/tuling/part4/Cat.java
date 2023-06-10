package com.tuling.part4;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(){}
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //比较的方法
    @Override
    public int compareTo(Cat o) {
        //this指向新增加进来的元素
        if(this.getAge()>o.getAge()){
            return -1;
        }else if(this.getAge()<o.getAge()){
            return 1;
        }
        //如果年龄相等，再比较名字
        return -(this.getName().compareTo(o.getName()));
    }
}