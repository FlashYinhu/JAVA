package com.kyh.sortalgorithm;

import java.util.Arrays;
import java.util.Random;

import static com.kyh.sortalgorithm.BubbleSortDemo.printArr;

public class QuickSortDemo {
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
        quickSort(numbers, 0, numbers.length - 1);
        long endTime = System.currentTimeMillis();// 获取程序的结束时间
        System.out.println(printArr(numbers));
        System.out.println("程序运行时间为" + (endTime - startTime) + "ms");
    }

    /**
     * @param numbers 待排数组
     * @param left 数组左边界
     * @param right 数组右边界
     */
    private static void quickSort(int[] numbers, int left, int right) {
        if (left < right){
            int leftIndex = left;
            int rightIndex = right;
            int pivot = numbers[leftIndex]; // 左侧为基准数
            while( leftIndex < rightIndex){
                while (leftIndex < rightIndex && numbers[rightIndex] > pivot){
                    rightIndex --;
                }
                if(leftIndex < rightIndex){
                    numbers[leftIndex] = numbers[rightIndex];
                    leftIndex ++;
                }
                while(leftIndex < rightIndex && numbers[leftIndex] < pivot){
                    leftIndex ++;
                }
                if (leftIndex < rightIndex){
                    numbers[rightIndex] = numbers[leftIndex];
                    rightIndex --;
                }
                numbers[leftIndex] = pivot;
                quickSort(numbers,leftIndex, rightIndex - 1);
                quickSort(numbers, leftIndex + 1, rightIndex);
            }
        }
    }

    /**
     *
     * @param numbers
     * @param left
     * @param right
     */
    private static void myQuickSort(int[] numbers, int left, int right){

    }
}
