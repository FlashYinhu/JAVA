package com.kyh.advanced;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionYY {
    public static void main(String[] args) {
        Integer[] arr = {3, 5 ,4 ,1, 6, 2};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
