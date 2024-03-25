package com.kyh.standard.StringDemo;

import java.util.Scanner;

public class Huiwenshu {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        StringBuilder sb = new StringBuilder(inputStr);
        if(sb.toString().equals(sb.reverse().toString())) {
            System.out.println("该字符串是一个对称字符串");
        }else{
            System.out.println("该字符串不是一个对称字符串");
        }
    }
}
