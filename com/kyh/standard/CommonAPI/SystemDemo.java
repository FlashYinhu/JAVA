package com.kyh.standard.CommonAPI;

public class SystemDemo {
    public static void main(String[] args) {
        // 时间的原点是 1970/1/1 中国 东八区 1970/1/1/AM 8:00
        System.out.println(System.currentTimeMillis());
        // 数组拷贝
        String[] strings = {"kangyinhu", "yinhuKang", "zhangrui", "ruizhang"};
        String[] strings1 = new String[10];
        System.arraycopy(strings, 0, strings1, 3 ,strings.length);
        for(int i =0 ; i < strings1.length; i ++){
            System.out.println(strings1[i]);
        }
    }
}
