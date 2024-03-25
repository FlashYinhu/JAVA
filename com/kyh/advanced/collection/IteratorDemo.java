package com.kyh.advanced.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("kyh");
        coll.add("zr");
        coll.add("xl");
//        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> iterator = coll.iterator(); // 获取迭代器对象 默认指向 0
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
