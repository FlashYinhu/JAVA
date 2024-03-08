package com.kyh.learn.CommonAPI;

import com.kyh.learn.CommonAPI.entity.JavaBean1;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 对象克隆
        JavaBean1 javaBean1 = new JavaBean1("kang", 20, "famale");
        JavaBean1 javaBean12 = (JavaBean1) javaBean1.clone();
        System.out.println(javaBean1);
        System.out.println(javaBean12);


        /*
        *  浅拷贝和深拷贝
        *  浅拷贝 不论对象内部的属性是基本数据类型还是引用数据类型 都会完全拷贝过来、
        *  深拷贝 基本数据类型拷贝过来 字符串复用 引用数据类型会重新创建新的
        */
    }
}
