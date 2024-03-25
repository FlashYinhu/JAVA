package com.kyh.web.practise;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class A01_Client {
    public static void main(String[] args) throws IOException {
        // 客户端 多次发送数据
        // 服务端 接受多次接收数据并打印
        Socket socket = new Socket("127.0.0.1", 8080);
        Scanner sc = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();

        while (true) {
            System.out.println("请输入你要发送的数据");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            outputStream.write(str.getBytes());
        }
        socket.close();
    }
}
