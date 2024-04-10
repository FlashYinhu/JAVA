package com.kyh.advanced.reflection;
// 测试Class类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Student();
        System.out.println(p1.name);

        Class c1 = p1.getClass();
        Class c2 = Class.forName("com.kyh.advanced.reflection.Student");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
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

    public String toString() {
        return "Person{name = " + name + "}";
    }
}

class Student extends Person{
    public Student(){
        this.name = "xuesheng";
    }
}

class Teacher extends  Person{
    public Teacher(){
        this.name = "laoshi";
    }
}