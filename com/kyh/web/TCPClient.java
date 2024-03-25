package com.kyh.web;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 创建客户端连接对象 创建对象的同时就会连接服务端 如果连接不上会报错
        Socket socket = new Socket("127.0.0.1", 10086);
        // 从连接通道中获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 写出数据
        outputStream.write("你好".getBytes());
        // 释放资源
        outputStream.close();
        socket.close();
    }
}
