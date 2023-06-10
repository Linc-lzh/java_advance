package com.tuling.part4;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        //开始毫秒数
        long start = System.currentTimeMillis();
        //1,创建缓冲流的输入输出对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\tuling\\io\\jdk8.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\tuling\\io\\newJDK8.exe"));

        //2,读写数据
        int len;
        byte[] buff =new byte[1024];
        while((len=bis.read(buff))!=-1){
            //
            bos.write(buff,0,len);
        }

        //3,关闭资源
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println("文件复制耗费的时间为:"+(end-start));

    }
}
