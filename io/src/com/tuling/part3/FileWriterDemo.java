package com.tuling.part3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //1，创建一个字符输出流
        FileWriter fw = new FileWriter("writer.txt");

        //2,写出数组
        //(1)写出一个字符
//        fw.write(97);
//        fw.write(98);
//        fw.write(99);
//        fw.write(100);

        //(2)写出一个字符数组
//        char[] chars = "abcdef".toCharArray();
//        fw.write(chars,0,3);

        //(3)直接写出字符串
        //fw.write("中国人hello");
        fw.write("中国人hello",3,5);






        //3,关闭资源；
        //fw.close();
        fw.flush();//刷新

        fw.write("abc");

        //
        fw.close();

    }
}
