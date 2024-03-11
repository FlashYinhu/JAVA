package com.kyh.learn.CommonAPI;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChong {
    // Pattern 和 Matcher
    // 爬取连接：https://leetcode.cn/中所有yjs的有关信息
    public static void main(String[] args) throws IOException {
        // 创建URL对象
        URL url = new URL("https://www.jd.com/");
        // 连接网址
        URLConnection connection = url.openConnection();
        // 读取器
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        // 获取正则表达式的对象
        String regex = "[^。？！]*应届生[^。？！]*[。？！]" ;
        Pattern pattern = Pattern.compile(regex);
        // 读取的时候每一次读取一整行
        while((line = br.readLine()) != null){
            System.out.println(line);
            // 利用m 读取l 按照p的规则
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }
}
