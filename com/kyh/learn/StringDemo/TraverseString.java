package com.kyh.learn.StringDemo;

import java.util.Scanner;

public class TraverseString {
    public static void main(String[] args) {
        // 键盘输入一个字符串并实现遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        printStr(str);
        System.out.println();
        int[] result = strElementCount(str);
        System.out.println("您输入的字符串中，大写字母有" + result[0] + "个，小写字母有" + result[1] + "个，数字有" + result[2] + "个。\n");

        System.out.println("请输入您要拼接的");
    
        sc.close();
    }

    public static void printStr(String str){
        for(int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            System.out.print(c + " ");
        }
    }

    public static int[] strElementCount(String str) {
        int[] result = new int[3];
        int bigC = 0;
        int smallC = 0;
        int number = 0;
        for(int i =0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                smallC ++;
            }else if(c >= 'A' && c <= 'Z') {
                bigC ++;
            }else if(c >= '0' && c <= '9') { // 注意 此时的0-9在ASCII码表中！
                number ++;
            }
        }
        result[0] = bigC;
        result[1] = smallC;
        result[2] = number;
        return result;
    }
}
