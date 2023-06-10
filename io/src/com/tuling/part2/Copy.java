package com.tuling.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        //1，创建输入输出流
        FileInputStream fis = new FileInputStream("D:\\tuling\\io\\001.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\tuling\\io\\002.jpg");

        //2,其实就是一边读取数据，一边写出数据
        byte[] buff = new byte[1024];

//        int len = fis.read(buff);
//        while(len!=-1){
//            fos.write(buff,0,len);
//            len = fis.read(buff);
//        }
        int len;//每次有效读取的字节个数
        while((len=fis.read(buff))!=-1){
            fos.write(buff,0,len);
        }


        //3，关闭输入输出流
        fos.close();
        fis.close();



    }
}
