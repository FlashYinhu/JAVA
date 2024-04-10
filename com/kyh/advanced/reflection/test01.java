package com.kyh.advanced.reflection;

import javax.swing.*;

// wt is reflection
public class test01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象
        Class c1 = Class.forName("com.kyh.advanced.reflection.Pojo");
        System.out.println(c1);
        Class c2 = Class.forName("com.kyh.advanced.reflection.Pojo");
        Class c3 = Class.forName("com.kyh.advanced.reflection.Pojo");
        Class c4 = Class.forName("com.kyh.advanced.reflection.Pojo");

        // 一个类在内存中只有一个Class对象
        // 一个类被加载后 类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());  //189568618
        System.out.println(c2.hashCode());  //189568618
        System.out.println(c3.hashCode());  //189568618
        System.out.println(c4.hashCode());  //189568618

    }

}

class Pojo {
    private String name;
    private int id;
    private int age;

    public Pojo() {
    }

    public Pojo(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Pojo{name = " + name + ", id = " + id + ", age = " + age + "}";
    }
}
