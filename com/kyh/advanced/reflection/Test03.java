package com.kyh.advanced.reflection;
// 测试Class类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Student();
        System.out.println(p1.name);

        Class c1 = p1.getClass(); // 通过对象获得
        Class c2 = Class.forName("com.kyh.advanced.reflection.Student"); // 通过forname获得
        Class c3 = Student.class; // 通过类名.class获得
        Class c4 = Integer.TYPE;// 内置包装类的Type属性
        Class c5 = c1.getSuperclass(); // 获得学生类的父类

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5);


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