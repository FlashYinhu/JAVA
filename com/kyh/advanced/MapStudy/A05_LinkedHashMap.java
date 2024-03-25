package com.kyh.advanced.MapStudy;

import java.util.LinkedHashMap;

public class A05_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("aaa", "bbb");
        linkedHashMap.put("bbb", "ccc");
        linkedHashMap.put("eee", "fff");
        linkedHashMap.put("hhh", "iii");
        System.out.println(linkedHashMap);
    }
}
