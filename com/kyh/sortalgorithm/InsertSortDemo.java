package com.kyh.sortalgorithm;

import java.util.Arrays;
import java.util.Random;

import static com.kyh.sortalgorithm.BubbleSortDemo.printArr;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        // 初始化排序列表
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100);
        }
        System.out.println("初始字符串为:");
        System.out.println(printArr(numbers));
        long startTime = System.currentTimeMillis();// 获得程序开始时间
        System.out.println(printArr(insertSort(numbers)));
        long endTime = System.currentTimeMillis();// 获取程序的结束时间
        System.out.println("程序运行时间为" + (endTime - startTime) + "ms");
    }

    private static int[] insertSort(int[] numbers) {
        int[] resultNumbers = Arrays.copyOf(numbers, numbers.length);
        for (int i = 1; i < resultNumbers.length; i++) {
            int temp = resultNumbers[i]; // 这是要插入的数据
            int j = i;
            while (j > 0 && temp < resultNumbers[j - 1]) {
                resultNumbers[j] = resultNumbers[j - 1];
                j --;
            }
            if (j != i){
                resultNumbers[j] = temp;
            }
        }
        return resultNumbers;
    }
}
