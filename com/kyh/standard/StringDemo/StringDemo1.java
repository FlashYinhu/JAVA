package com.kyh.standard.StringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        UserInfo usr1 = new UserInfo("kangyinhu", "kyh123456789");
        UserInfo usr2 = new UserInfo("zhangrui", "zr123456789");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的用户名");
            String str1 = sc.next();
            System.out.println("请输入您的密码");
            String str2 = sc.next();
            
            if(usr1.getName().equals(str1) && usr1.getPassword().equals(str2)) {
                System.out.println("用户登陆成功！");
                break;
            }else{
                if(i != 2){
                    System.out.println("用户登陆失败！用户名或密码错误！请重新输入！");
                }else{
                    System.out.println("错误三次！请3min后重试！");
                }
            }
        }

        sc.close();
    }
}
