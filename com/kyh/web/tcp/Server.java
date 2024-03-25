package com.kyh.web.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException { // 抛出接口异常 防止指定监听端口被占用
        ServerSocket ss = new ServerSocket(8080);//指定监听端口
        System.out.println("服务器成功运行");
        for (;;){
            Socket socket = ss.accept();
            System.out.println("收到来自" + socket.getRemoteSocketAddress() + "的连接");
            Thread t = new Handelr(socket);
            t.start();
        }
    }
}

class  Handelr extends Thread{ //进程子类
    Socket socket; // 进程中含有socket对象

    public Handelr(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(InputStream inputStream = this.socket.getInputStream()){
            try(OutputStream outputStream = this.socket.getOutputStream()) {
                handle(inputStream, outputStream);
            }
        } catch (Exception e) {
            try {
                this.socket.close();
            } catch (IOException ioException){
                System.out.println("客户端断开");
            }
        }
    }

    private void handle(InputStream inputStream, OutputStream outputStream) throws IOException {
        var writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        var reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        writer.write("这是来自服务器的信息 你已连接到localhost:8080端口\n");
        writer.flush();
        for(;;){
            String s = reader.readLine();
            if (s.equals("bye")) {
                writer.write("bye!\n");
                writer.flush();
                break;
            }
            writer.write("ok,收到: " + s + "\n");
            writer.flush();
        }

    }
}
