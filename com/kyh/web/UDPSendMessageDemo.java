package com.kyh.web;

import java.io.IOException;
import java.net.*;

public class UDPSendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        DatagramSocket ds = new DatagramSocket();
        // 打包数据
        String str = "Hello!";
        byte[] bytes = str.getBytes();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 10086; // 注意这是目的端口
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, port);
        // 发送数据
        ds.send(datagramPacket);
        // 释放资源
        ds.close();
    }
}
