package com.kyh.learn.StringDemo;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String str = inputString();
        printStr(str);
        System.out.println(stringReverse(str));
    }



    public static String stringReverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i >= 0; i --) {
            // i 依次表示字符串中的每一个索引 倒着的
            char c = str.charAt(i);
            result = result + c;
        }
        return result;

    }

    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a String end of return:");
        String result = sc.next();
        return result;
    }

    public static void printStr(String str){
        for(int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
