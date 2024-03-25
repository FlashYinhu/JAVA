package com.kyh.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建对象ServerSocket
        ServerSocket serverSocket = new ServerSocket(10086);
        // 监听客户端的连接请求
        Socket socket = serverSocket.accept();
        // 从连接中获取输入流读取数据
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int b;
        while((b = inputStreamReader.read()) != -1){
            System.out.print((char) b);
        }
        // 释放资源
        socket.close();
        serverSocket.close();
    }
}
