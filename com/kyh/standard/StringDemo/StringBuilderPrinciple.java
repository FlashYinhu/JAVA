package com.kyh.standard.StringDemo;

public class StringBuilderPrinciple {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 容量 最多装多少
        // 长度 已经装了多少
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("abc");
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 3

        sb.append("abcsadkjadskufjgaklsjfa");
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 26

        sb.append("sagdiugqiwuteqiowgtroutqwriogqwro");
        System.out.println(sb.capacity()); // 70
        System.out.println(sb.length()); // 59????
    }
    
}
