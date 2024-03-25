package com.kyh.web.practise;

import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\MyProjects\\Java\\ClientFile\\test.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }
        // 往服务器写出结束标记
        socket.shutdownOutput();

        // 接受服务器的回写数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        socket.close();
    }
}
