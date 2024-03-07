package com.kyh.learn.Object;

public class PrivateDemo {
    private String name;
    private int age;
    private String gender;

    // 针对每个私有化的成员变量 提供get set 方法
    // set方法 给成员变量赋值
    // get方法 对外提供成员变量的值
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 18 || age < 50){
            this.age = age;
        }else{
            System.out.println("非法年龄！");
        }
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

}
