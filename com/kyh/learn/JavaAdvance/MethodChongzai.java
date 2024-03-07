package com.kyh.learn.JavaAdvance;

public class MethodChongzai {
    public static void main(String[] args) {
        
    }

    // 方法的重载
    // 不看返回值 只看是不是同一个类中相同的方法名不同的形式参数
    // 参数顺序不同构成重载但是不建议
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c; 
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
