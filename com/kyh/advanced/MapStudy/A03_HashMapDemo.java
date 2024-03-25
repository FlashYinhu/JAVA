package com.kyh.advanced.MapStudy;

import java.util.HashMap;
import java.util.Set;

public class A03_HashMapDemo {
    public static void main(String[] args) {
        // 创建HashMap对象
        HashMap<Student, String> hm = new HashMap<>();
        // 创建实体对象
        Student s1 = new Student("kanagyinhu", 23);
        Student s2 = new Student("zhangrui", 23);
        Student s3 = new Student("xiaolei", 22);
        // 添加元素
        hm.put(s1,"shuaige");
        hm.put(s2, "meinv");
        hm.put(s3, "chengxuyuan");
        // 遍历集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + " = " + value );
        }
    }

}
