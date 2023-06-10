package com.tuling.part1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer_IM {
    public static void main(String[] args) {
        System.out.println("服务端启动了,等待连接...");
        Scanner scanner  = new Scanner(System.in);
        //1,创建服务端
        Socket accept = null;//建立完连接之后，会发生阻塞，等待客户端的连接
        InputStream is = null;
        OutputStream os = null;
        try {
            ServerSocket ss =  new ServerSocket(6666);
            //2,接受客户端的连接
            accept = ss.accept();

            while(true){
                //3,获取输入流对象
                is = accept.getInputStream();
                //4,通过输入流接收客户端发送过来的数据
                byte[] buffer = new byte[1024];
                int len = is.read(buffer);//读取到字节数组里面去，然后返回有效读取的个数
                System.out.println("客户端说："+new String(buffer,0,len));

                //服务端写出数据到客户端
                os = accept.getOutputStream();
                //服务端说的内容用键盘录入的方式来完成
                System.out.println("请输入：");
                String content = scanner.nextLine();
                os.write(content.getBytes());
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5,关闭资源
            try {
                os.close();
                is.close();
                accept.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
