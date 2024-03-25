package com.kyh.advanced.collection.fanxing;

import java.util.Arrays;

public class fangxingClass <E>{ //将E理解为一个变量 不用来记录数据 用来记录数据的类型
    // T E K V ： Type Element Key Value
    Object[] obj = new Object[10];
    int size;

    /**
     * E 表示是不确定的类型 类型名后面已经定义过了
     * e 形参的名字 变量名字
     */
    public boolean add(E e){
        obj[size] = e;
        size ++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
    /**
     * 利用泛型的通配符 限制泛型的类型
     * 如果类型不确定但是知道继承体系
     * ?
     * ? extends E
     * ? super E
     */
}
