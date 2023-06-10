package com.tuling.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        //1,创建输入流对象，相对路径，抛出异常
        FileInputStream fis = new FileInputStream("fis.txt");
        //2,读取数据
//        char c = (char)fis.read();
//        System.out.println("字符:"+c);
//        c = (char)fis.read();
//        System.out.println("字符："+c);
//        c = (char)fis.read();
//        System.out.println("字符："+c);
//        int end = fis.read();
//        System.out.println("文件的末尾："+end);
        //一个字节一个字节的读取
//        int c;
//        while((c=fis.read())!=-1){
//            System.out.println("字符："+(char)c);
//        }

        //读取一个字节数组
        byte[] bytes = new byte[2];
        int len;//每次读取到的有效的字节个数
        while((len=fis.read(bytes))!=-1){
//            System.out.println("字符串："+new String(bytes));
            System.out.println("字符串："+new String(bytes,0,len));

        }

        //3,关闭流
        fis.close();



    }
}
