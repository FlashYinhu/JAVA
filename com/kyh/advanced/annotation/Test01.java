package com.kyh.advanced.annotation;

import java.util.ArrayList;
import java.util.List;

// what is annota
public class Test01 extends Object{

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated // 不推荐程序员使用 可以使用 有更好的方式
    public static void test(){
        System.out.println("hello!");
    }

    @SuppressWarnings("all") // 镇压警告
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {

    }
}
