package com.kyh.web.practise;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        // 读取数据并保存到文件中
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\MyProjects\\Java\\ServerFile\\test.png"));
        int len;
        byte[] bytes = new byte[1024];
        while((len = bufferedInputStream.read()) != -1 ){
            bufferedOutputStream.write(bytes,0,len);
        }
        // 回写数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("上传成功");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        socket.close();
        serverSocket.close();
    }
}
