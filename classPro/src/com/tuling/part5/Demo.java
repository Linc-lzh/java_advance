package com.tuling.part5;

class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}

public class Demo {

    public static void changeNum(int num){
        num = 34;
        //System.out.println("改变之后的num:"+num);;
    }

    public static void changePerson(Person p){
        p = new Person();
        p.setName("成龙");
        p.setAge(28);
        //System.out.println("改变之后的num:"+num);;
    }

    public static void main(String[] args) {

        int num = 10;//按值传递
        changeNum(num);
        System.out.println("改变之后的num:"+num);;

        System.out.println("=======================");

        Person p1 = new Person("zhoujielun",30);
        changePerson(p1);
        System.out.println("p1:"+p1);



    }
}
