package com.kyh.standard.StringDemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---"); // 单参构造 指定连接符号
        // 指定间隔符号 开始符号和结束符号
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        System.err.println(sj.add("hello").add("java").toString());
        System.out.println(sj2.add("kang").add("yin").add("hu").toString());
        System.out.println(sj2.length());
    }
}
