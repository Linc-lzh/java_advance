package com.tuling.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        //1，创建字节输出流，绝对路径，捕获异常
        FileOutputStream fos = null;
        try {
             fos = new FileOutputStream("d:\\tuling\\io\\fos.txt");//默认是覆盖原有的内容
             //fos = new FileOutputStream("d:\\tuling\\io\\fos.txt",true);
            //FileOutputStream fos2 = new FileOutputStream(new File("d:\\tuling\\io\\fis.txt"));
            //2，写出数据,
            //写出数据：虽然参数为int类型四个字节，但是只会保留一个字节的信息写出
            //写一个字节
//            fos.write(97);
//            fos.write(98);
//            fos.write(99);

            //写出一个字节数组
//            byte[] bytes = "hello,world".getBytes();
//            fos.write(bytes);

            //写出一个字节数组，指定区间
            byte[] bytes = "abcde".getBytes();

            fos.write(bytes,2,3);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3,最后一定要记得关闭流
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
