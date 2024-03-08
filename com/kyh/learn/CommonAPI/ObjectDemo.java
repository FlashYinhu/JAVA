package com.kyh.learn.CommonAPI;

import com.kyh.learn.CommonAPI.entity.JavaBean1;

public class ObjectDemo {
    /*
        toString 返回对象的字符串表示形式
        equals(Object) 比较两个对象是否相等
        clone 对象克隆
    */
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); //java.lang.Object@b4c966a 类 + 地址值
        JavaBean1 javaBean1 = new JavaBean1("kangyinhu", 24, "男");
        System.out.println(javaBean1.toString());
    }
}
