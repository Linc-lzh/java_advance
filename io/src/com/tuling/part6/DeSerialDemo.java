package com.tuling.part6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1,创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"));

        //2,读取数据并且恢复成对象,反序列化
        Employee employee = (Employee) ois.readObject();

        //3,
        System.out.println(employee);

        //4,关闭资源
        ois.close();


    }
}
