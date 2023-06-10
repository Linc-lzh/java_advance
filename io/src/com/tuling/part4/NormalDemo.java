package com.tuling.part4;

import java.io.*;

public class NormalDemo {
    public static void main(String[] args) throws IOException {
        //开始毫秒数
        long start = System.currentTimeMillis();

        //1,创建输入输出流
        FileInputStream fis = new FileInputStream("D:\\tuling\\io\\jdk8.exe");
        FileOutputStream fos = new FileOutputStream("D:\\tuling\\io\\newJDK8.exe");

        //2，读写数据
        int len;
        byte[] buff = new byte[1024];
        while((len=fis.read(buff))!=-1){
            //写数据
            fos.write(buff,0,len);
        }

        //3，关闭资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("文件复制耗费的时间为:"+(end-start));

    }
}
