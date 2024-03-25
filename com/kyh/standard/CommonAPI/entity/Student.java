package com.kyh.standard.CommonAPI.entity;

public class Student implements Cloneable {
    private String name;
    private int age;
    private int[] path;

    public Student() {
    }

    public Student(String name, int age, int[] path) {
        this.name = name;
        this.age = age;
        this.path = path;
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

    public int[] getPath() {
        return path;
    }

    public void setPath(int[] path) {
        this.path = path;
    }

    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < this.path.length; i++) {
            s += path[i];
        }
        return this.name + " " + this.age + " " + s;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws  CloneNotSupportedException{
        int[] newpath = new int[this.path.length];
        for (int i = 0; i < this.path.length; i++) {
            newpath[i] = path[i];
        }
        // 调用父类方法克隆对象
        Student student = (Student) super.clone();
        student.path = newpath;
        return student;
    }

    public void printTest(){
        System.out.println(this);
    }

}
