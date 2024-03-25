package com.kyh.standard.StringDemo;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        // 字符串的比较
        String name1 = "kangyinhu";
        String name2 = new String("kangyinhu");
        String name3 = "KANGYINHU";
        System.out.println(name1 == name2); //内存中地址不一样
        System.out.println(name1.equals(name2));// 完全一样比较
        System.out.println(name2.equalsIgnoreCase(name3)); //忽略大小写(只能是英文 1，一，壹不可以)

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串abc");
        String inputStr = sc.next(); // next()录入的对象是new出来的
        String initStr = "abc";
        System.out.println(initStr == inputStr);

        sc.close();
    }
}
