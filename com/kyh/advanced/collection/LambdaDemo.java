package com.kyh.advanced.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        // 创建集合添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("kangyinhushishuaige");
        coll.add("zhangruishidameinv");
        coll.add("xiaoleishixiaokeai");
        // 利用lambda表达式遍历
        coll.forEach(s -> System.out.println(s));
    }
}
