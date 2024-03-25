package com.kyh.web.tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080); //指定服务器和端口
        try(InputStream inputStream = socket.getInputStream()){
            try(OutputStream outputStream = socket.getOutputStream()){
                handle(inputStream, outputStream);
            }
        }
        socket.close();
        System.out.println("连接已断开");
    }

    private static void handle(InputStream inputStream, OutputStream outputStream) throws  IOException{
        var writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        var reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Server]" + reader.readLine());
        while(true) {
            System.out.print(">>>");
            String s= scanner.nextLine();
            writer.write(s);
            writer.newLine();
            /**
             * flush 方法的意义 将未满的缓冲区中的内容强制发送到网络
             */
            writer.flush();
            String resp = reader.readLine();
            System.out.println("<<<" + resp);
            if (resp.equals("bye")) {
                break;
            }
        }
    }
}
