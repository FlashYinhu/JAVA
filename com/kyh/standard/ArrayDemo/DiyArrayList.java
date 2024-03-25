package com.kyh.standard.ArrayDemo;

import java.util.ArrayList;

import com.kyh.standard.Object.StandardJavaBean;

public class DiyArrayList {
    public static void main(String[] args) {
        ArrayList<StandardJavaBean> arrayList = new ArrayList<>();
        StandardJavaBean sd = new StandardJavaBean();
        StandardJavaBean sd1 = new StandardJavaBean("kangyinhu", "kyh123", "kanyinhu", "male",24);
        StandardJavaBean sd2 = new StandardJavaBean("kangyinhu", "kyh123", "kanyinhu", "male",24);
        StandardJavaBean sd3 = new StandardJavaBean("kangyinhu", "kyh123", "kanyinhu", "male",24);


        arrayList.add(sd);
        arrayList.add(sd1);
        arrayList.add(sd2);
        arrayList.add(sd3);

        System.out.println(arrayList);
    }
}
