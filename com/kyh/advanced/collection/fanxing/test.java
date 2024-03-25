package com.kyh.advanced.collection.fanxing;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的好处 统一数据类型 避免强制类型转换的异常
 * java中的泛型是伪泛型 只在编译时有效
 * 当数据添加到集合中时 集合仍然会将数据当作object 获取时再强转回来
 * 编译成字节码时 会发生泛型的擦除
 */
public class test {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("kangyinhu");
        arrayList.add(new entity("kangyinhu", 24));

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            // 多态的弊端是不能访问子类的特有功能
            System.out.println(o);
        }
        fangxingClass<String> fx = new fangxingClass<>();
        fx.add("kangyinhu");
        System.out.println(fx);

    }
}
