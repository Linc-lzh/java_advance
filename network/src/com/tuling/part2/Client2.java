package com.tuling.part2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //1,
        DatagramSocket recieveSocket = new DatagramSocket(8888);
        //2，接收数据
        byte[] data = new byte[1024];
        //3,创建了数据报包
        DatagramPacket packet = new DatagramPacket(data,data.length);
        //4,接收数据
        recieveSocket.receive(packet);

        System.out.println("客户端2接收到数据："+new String(data,0,packet.getLength()));



        //指定端口和IP地址
        int port = 9999;
        InetAddress localhost = InetAddress.getByName("localhost");//本机的地址
        byte[] data2 = "hello,Client1".getBytes();
        //创建数据报包
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, localhost, port);
        //发送数据
        recieveSocket.send(packet2);

        //关闭资源
        recieveSocket.close();


    }
}
