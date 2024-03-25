package com.kyh.standard.CommonAPI;

import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取runtime的对象 获取运行环境
        //Runtime runtime = Runtime.getRuntime();
        //runtime.exit(0); // 停止虚拟机
        // 方法二 直接调用静态方法 Runtime.getRuntime().exit(0);

        // 获取CPU的线程数量
        System.out.println("CPU的核心数量是" + Runtime.getRuntime().availableProcessors());
        // 虚拟机能从系统中获取的总内存大小 单位是byte
        System.out.println("目前虚拟机可以从系统中获取的最大内存是" + (Runtime.getRuntime().maxMemory() / 1024 / 1024) + "Mb");
        // 已经获取的内存
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        // 剩余内存
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        // 调用cmd命令
        Runtime.getRuntime().exec("notepad");

        System.out.println("hello!");

    }
}
