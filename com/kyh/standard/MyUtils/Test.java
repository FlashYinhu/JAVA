package com.kyh.standard.MyUtils;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(ArrUtil.printArr(numbers));
        double[] numbers2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(ArrUtil.getAverage(numbers2));
    }
}
