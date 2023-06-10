package com.tuling.part3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //1,创建一个字符输入流
        FileReader fr =new FileReader("read.txt");
        //2,读取数据
//        char ch = (char)fr.read();
//        System.out.println("ch:"+ch);
//        int ch;
//        while((ch=fr.read())!=-1){
//            System.out.println("ch:"+(char)ch);
//        }
        //字符数组
        char[] charBuff = new char[10];
        int len;
        while((len=fr.read(charBuff))!=-1){
            System.out.println("内容："+new String(charBuff,0,len));
        }

        //3,关闭资源
        fr.close();


    }
}
