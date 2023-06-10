package com.tuling.part5;

import java.io.*;

public class TransferDemo {
    public static void main(String[] args) throws IOException {
        //用默认的编码方式去读取的
        //FileReader fr = new FileReader("file_gbk.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file.txt"),"UTF-8");


        char[] charArr = new char[100];
        int len;
        while((len=isr.read(charArr))!=-1){
            System.out.println(new String(charArr,0,len));
        }

        //
        isr.close();

        System.out.println("------------------------------");

        //1,创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"utf-8");

        //2,写出内容
        osw.write("你好");
        osw.write("转换流!!");

        osw.close();


    }
}
