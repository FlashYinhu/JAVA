package com.kyh.advanced.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * 删除元素时 用迭代器
 * 在遍历过程中需要添加元素 只能使用列表爹大气
 * 仅仅想要遍历 使用增强for或者lambda
 * 遍历的时候想操作索引 用普通for
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("zhangrui");
        myList.add("xiaolei");
        myList.add("kangyinhu");
        // 迭代器遍历
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        // 增强for
        for (String s : myList) {
            System.out.println(s);
        }
        // lambda表达式
        myList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // for
        for (int i = 0; i < myList.size(); i++) {
            String s = myList.get(i);
            System.out.println(s);
        }
        // 列表迭代器 在遍历的过程中可以添加元素
        ListIterator<String> stringListIterator = myList.listIterator();
        while(stringListIterator.hasNext()){
            String str = stringListIterator.next();
            if("kangyinhu".equals(str)){
                stringListIterator.add("qujuntaoniubi");
            }
            System.out.println(str);
        }
    }
}
