package com.tuling.part1;


public class Person {
    private String name;
    private int age;
    public int i;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        this.name = name;
    }

    @MyAnno4(age=21)
    public void eat(){
        System.out.println("eat().....");
    }

    public void eat(String foodName){
        System.out.println("eat()....."+foodName);
    }


    public int eat(int num){
        System.out.println("eat()....."+num);
        num++;
        return num;
    }

    private void sleep(){
        System.out.println("sleep()....");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", i=" + i +
                '}';
    }
}
