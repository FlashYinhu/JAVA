package com.kyh.advanced.MapStudy;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo {
    public static void main(String[] args) {
        // 创建mMap的对象
        Map<String, String> map = new HashMap<>();

        // 添加元素
        // put方法 在添加数据的时候 如果键不存在 添加到map集合中
        // 如果键存在 那么会发生覆盖并返回被覆盖的值
        map.put("kangyinhu", "zhangrui");
        map.put("xiaolei", "heavean");
        String s = map.put("aaa", "bbb");
        System.out.println(s);
        String s1 = map.put("aaa", "ccc");
        System.out.println(s1);
        map.put("bbb","ccc");

        String result = map.remove("aaa");
        System.out.println(result);

        // 判断是否包含
        System.out.println(map.containsKey("kangyinhu"));
        System.out.println(map.containsValue("zhangrui"));

        // 打印集合
        System.out.println(map);
        System.out.println(map.size());

        map.clear();
        System.out.println(map);
        System.out.println(map.size());
    }
}
