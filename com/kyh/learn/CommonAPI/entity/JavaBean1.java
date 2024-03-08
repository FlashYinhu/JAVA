package com.kyh.learn.CommonAPI.entity;

/*
    * 如果一个接口没有抽象方法 表明该接口是一个标记性接口
    * Cloneable表示一旦实现了 表示当前对象可以被克隆
    * 如果没有被实现 说明当前对象不可以被克隆
    *
*/

public class JavaBean1 implements Cloneable{
    private String name;
    private int age;
    private String gender;

    public JavaBean1() {
    }

    public JavaBean1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + this.gender + this.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 调用父类中的clone方法 返回克隆后的对象
        return super.clone();
    }
}
