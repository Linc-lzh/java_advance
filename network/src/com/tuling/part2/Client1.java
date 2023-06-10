package com.tuling.part2;

import java.io.IOException;
import java.net.*;

public class Client1 {
    public static void main(String[] args) throws IOException {
        //发送数据
        System.out.println("Client1启动了....");
        DatagramSocket sendSocket = new DatagramSocket(9999);//这个端口用来接收数据
        //指定端口和IP地址
        int port = 8888;
        InetAddress localhost = InetAddress.getByName("localhost");//本机的地址
        byte[] data = "hello,Client2".getBytes();
        //创建数据报包
        DatagramPacket packet = new DatagramPacket(data, data.length, localhost, port);
        //发送数据
        sendSocket.send(packet);



        //接收数据
        //2，接收数据
        byte[] data2 = new byte[1024];
        //3,创建了数据报包
        DatagramPacket packet2 = new DatagramPacket(data2,data2.length);
        //4,接收数据
        sendSocket.receive(packet2);

        System.out.println("客户端1接收到数据："+new String(data2,0,packet2.getLength()));


        //关闭资源
        sendSocket.close();


    }
}
