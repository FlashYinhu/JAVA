package com.kyh.learn.CommonAPI;

import com.kyh.learn.CommonAPI.entity.JavaBean1;
import com.kyh.learn.CommonAPI.entity.Student;

public class DeepAndShallowClone {
    /*
     *  浅拷贝和深拷贝
     *  浅拷贝 不论对象内部的属性是基本数据类型还是引用数据类型 都会完全拷贝过来、
     *  深拷贝 基本数据类型拷贝过来 字符串复用 引用数据类型会重新创建新的
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // object 中的克隆是浅克隆
        int[] nums = {1,2,3,4,5,6,7,8,9,};
        Student student = new Student("kang", 20, nums);
        Student student2 = (Student) student.clone();
        Student student3 = (Student) student.deepClone();
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        int[] newnums  = student.getPath();
        newnums[0] = 100;
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3); // 深克隆 当原对象改变时 新对象不改变

        // 第三方对象导入包

    }


}
