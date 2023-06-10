package com.tuling.part4;

import java.io.*;

public class BufferDemo2 {
    public static void main(String[] args) throws IOException {
        //1,创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));

        //2,读取数据
        //新增了一个方法
        //String line = br.readLine();
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //3,关闭资源
        br.close();


        System.out.println("---------------------------------");

        //1,创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        //2,写数据
        bw.write("hello");
        //
        bw.newLine();//换行
        bw.write("china");

        //3,关闭资源
        bw.close();






    }
}
