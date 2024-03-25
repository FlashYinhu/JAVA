package com.kyh.standard.AbstactDemo;

public abstract class Animal {
    /*
     * 抽象类中不一定有抽象方法 但有抽象方法的类一定是抽象类
     * 不能被实例化
     * 可以有构造方法
     * 子类要么还是抽象类 要么必须重写抽象类中的所有抽象方法
     */
    private String name;
    private String gender;

    
    public Animal() {
    }

    // 抽象类的构造方法的意义
    // 创建子类对象时给属性进行复制
    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public abstract void eat();
    public abstract void sleep();
    public abstract void shout();
}
