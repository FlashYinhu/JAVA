package com.kyh.learn.Object;

public class Bridge {
    private String brand;
    private double price;
    private String maker;

    /*
     * 构造方法 方法名和类名完全相同
     * 没有返回值类型 连void都没有
     * 没有具体的返回值 不能由return带回结果数据
     * 执行时机
     * 创建对象的时候由虚拟机调用 不可手动调用
     * 每创建一次对象都会调用一次构造方法
     * 如果我们自己没有写构造方法
     * 虚拟机会自动加上构造方法
     * 如果已经定义了构造方法 系统则不会提供空参构造
     */
    public Bridge(String brand, double price, String maker){
        System.out.println("这是带参构造方法！");
        this.brand = brand;
        this.price = price;
        this.maker = maker;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public String getMaker() {
        return maker;
    }
}
