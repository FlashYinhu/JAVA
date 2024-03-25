package com.kyh.web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        // 创建DatagramSocket对象 注意绑定端口 且绑定端口与发送端口保持一致
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        // 接受数据包
        byte[] bytes= new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 该方法是阻塞的 程序执行到这里时会死等
        datagramSocket.receive(datagramPacket);
        // 解析数据包
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        InetAddress address = datagramPacket.getAddress();
        int port = datagramSocket.getPort();
        System.out.println("接收到数据" + new String(data, 0,length));
        System.out.println("数据从" + address + ":" + port + "接口发出");
        // 释放资源
        datagramSocket.close();
    }

}
