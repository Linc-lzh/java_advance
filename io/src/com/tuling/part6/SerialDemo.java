package com.tuling.part6;

import java.io.*;

class Employee implements Serializable {
    //private static final long serialVersionUID = 1L;

    private String name;
    private  String address;//transient修饰的属性不能被序列化，是瞬时状态
    private int age;


    public Employee(){}
    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class SerialDemo {
    public static void main(String[] args) throws IOException {
        //1,创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.txt"));

        //2,创建对象
        Employee employee = new Employee("逍遥子","杭州");

        //3,序列化
        oos.writeObject(employee);

        //4,关闭资源
        oos.close();
        System.out.println("序列化完成");


    }
}
