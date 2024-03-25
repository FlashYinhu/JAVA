package com.kyh.sortalgorithm;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Random;

import static com.kyh.sortalgorithm.BubbleSortDemo.printArr;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random  = new Random();
        // 初始化排序列表
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100);
        }
        System.out.println("初始字符串为:");
        System.out.println(printArr(numbers));
        long startTime = System.currentTimeMillis();// 获得程序开始时间
        System.out.println(printArr(selectSort(numbers)));
        long endTime = System.currentTimeMillis();// 获取程序的结束时间
        System.out.println("程序运行时间为" + (endTime - startTime) + "ms");
    }

    public static int[] selectSort(int[] initNumbers) {

        int[] resultNumbers = Arrays.copyOf(initNumbers, initNumbers.length);
        // 一共比较 n - 1 轮
        for (int i = 0; i < resultNumbers.length - 1; i++) {
            int min = i; // 假设初始比较为最小
            for (int j = i + 1; j < resultNumbers.length; j++) {
                // 如果被比较位较小 则最小值为j
                if(resultNumbers[j] < resultNumbers[min]) {
                    min = j;
                }
            }
            if(i != min) { // 最小值不是i了 就交换i和min记录的下标
                swap(resultNumbers, i, min);
            }
        }
        return resultNumbers;
    }

    private static void swap(int[] resultNumbers, int i, int min) {
        int temp = resultNumbers[i];
        resultNumbers[i] = resultNumbers[min];
        resultNumbers[min] = temp;
    }

}
