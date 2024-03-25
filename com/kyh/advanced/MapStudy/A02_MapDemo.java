package com.kyh.advanced.MapStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/***
 * HashMap底层是哈希表结构
 * 依赖hashCode方法和equals方法保证键的唯一
 * 如果键存储的是自定义对象需要重写hashCode和equals方法
 * 如果值存储的是自定义对象不需要重写hashCode和equals方法
 */
public class A02_MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("kangyinhu", "huyinkang");
        map.put("zhangrui", "ruizhang");
        map.put("xiaolei", "leixiao");

        // 获取所有的键 放在一个单列集合中
        Set<String> mySet = map.keySet();
        System.out.println(mySet);
        // 遍历单列集合 获取每一个键
        for (String s : mySet) {
            // 利用map中的键 获取对应的值
            System.out.println(s + " = " + map.get(s));
        }

        // 键值对 Entry
        // 获取所有的键值对对象 返回一个set集合
        System.out.println();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 利用lambda表达式
        // 方法的底层是键值对 Entry
        System.out.println();
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value );
            }
        });
    }
}
