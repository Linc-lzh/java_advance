package com.tuling.part1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        //1,创建Socket,连接服务端
        Socket client = new Socket("localhost",6666);
        //2,获取输出流对象
        OutputStream os = client.getOutputStream();
        //3,通过输出流，输出响应的数据
        os.write("你好，服务端！".getBytes());

        //获取服务端输出来的数据
        InputStream is = client.getInputStream();
        //字节数组
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println("服务端说："+new String(buffer,0,len));


        //4,关闭相关资源
        os.close();
        client.close();
    }
}
