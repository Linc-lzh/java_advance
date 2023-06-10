package com.tuling.part1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient_IM {
    public static void main(String[] args) {
        System.out.println("客户端启动了...");
        Scanner scanner = new Scanner(System.in);

        //1,创建Socket,连接服务端
        Socket client = null;
        OutputStream os = null;
        InputStream is  = null;
        try {
            client = new Socket("localhost",6666);


            while(true){
                //2,获取输出流对象
                os = client.getOutputStream();
                //3,通过输出流，输出响应的数据
                System.out.println("请输入：");
                String content = scanner.nextLine();
                os.write(content.getBytes());

                //获取服务端输出来的数据
                is = client.getInputStream();
                //字节数组
                byte[] buffer = new byte[1024];
                int len = is.read(buffer);
                System.out.println("服务端说："+new String(buffer,0,len));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4,关闭相关资源
            try {
                is.close();
                os.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
