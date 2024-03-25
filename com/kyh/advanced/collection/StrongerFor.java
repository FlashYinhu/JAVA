package com.kyh.advanced.collection;

import java.util.*;

public class StrongerFor {
    /**
     * 增强for底层就是迭代器
     * 原理就是一个Iterator迭代器
     * 所有单列结合和数组才能用增强for遍历
     * for (Type param: Array/List){
     *
     * }
     */
    public static void main(String[] args) {
        // 创建集合添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("kangyinhushishuaige");
        coll.add("zhangruishidameinv");
        coll.add("xiaoleishixiaokeai");
        /**
         * str 就是一个第三方变量 循环过程中表示每一个变量
         */
        for(String str: coll){
            System.out.println(str);
        }

        List<Map<String, String>> myList = new ArrayList<>();
        Map<String, String> myMap = new HashMap<>();
        myMap.put("shuaige", "kangyinhu");
        myMap.put("meinv", "zhangrui");
        Map<String, String> myMap2 = new HashMap<>();
        myMap2.put("chengxuyuan", "xiaolei");
        myMap2.put("youxigaoshou", "qujuntao");
        myList.add(myMap);
        myList.add(myMap2);
        for (Map<String, String> map : myList) {
            System.out.println(map);
        }

    }
}
