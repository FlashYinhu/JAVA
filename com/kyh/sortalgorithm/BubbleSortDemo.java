package com.kyh.sortalgorithm;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortDemo {
    public static void main(String[] args) {
        // 生成随机数组 长度为50 范围为1~100
        Random random = new Random();
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1,100);
        }
        System.out.println("初始数组为");
        System.out.println(printArr(numbers));
        System.out.println(printArr(bubbleSort(numbers)));

    }

    public static int[] bubbleSort(int[] initArr){
        int[] resultArr = Arrays.copyOf(initArr, initArr.length);
        int count = 1;
        for (int i = 0; i < resultArr.length - 1; i++) {
            boolean flag  = true; // 假设数组已经有序
            System.out.printf("这是第%d次冒泡排序\n", count ++);
            for (int j = 0; j < resultArr.length - 1 - i  ; j++) { // 冒泡排序后 数组最后的部分已经有序 无需再比
                if (resultArr[j] > resultArr[j + 1]) {
                    int temp = resultArr[j];
                    resultArr[j] = resultArr[j + 1];
                    resultArr[j + 1] = temp;
                    flag = false; // 发生交换数组无序
                }
            }
            if (flag) {
                break; // 跳出循环 已经排完
            }
            System.out.println(printArr(resultArr));
        }
        return resultArr;
    }


    // 打印字符串
    public static String printArr(int[] arr){
        String result = "[";
        for (int i = 0; i < arr.length ; i++) {
            if (i == arr.length - 1){
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ", ";
            }
        }
        return result;
    }

}
