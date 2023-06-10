package com.tuling.part1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {

        //1,创建服务端
        ServerSocket ss =  new ServerSocket(6666);
        //2,接受客户端的连接
        Socket accept = ss.accept();//建立完连接之后，会发生阻塞，等待客户端的连接

        //3,获取输入流对象
        InputStream is = accept.getInputStream();
        //4,通过输入流接收客户端发送过来的数据
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);//读取到字节数组里面去，然后返回有效读取的个数
        System.out.println("客户端说："+new String(buffer,0,len));

        //服务端写出数据到客户端
        OutputStream os = accept.getOutputStream();
        os.write("你好，客户端！".getBytes());

        //5,关闭资源
        os.close();
        is.close();
        accept.close();
    }
}
