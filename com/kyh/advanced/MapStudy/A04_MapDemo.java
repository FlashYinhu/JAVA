package com.kyh.advanced.MapStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class A04_MapDemo {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            arrayList.add(arr[index]);
        }

        HashMap<String , Integer> hashMap = new HashMap<>();
        for (String s : arrayList) {
            if(hashMap.containsKey(s)){
                int count = hashMap.get(s);
                count ++;
                hashMap.put(s, count);
            } else {
                hashMap.put(s, 1);
            }
        }

        System.out.println(hashMap);
    }

}
