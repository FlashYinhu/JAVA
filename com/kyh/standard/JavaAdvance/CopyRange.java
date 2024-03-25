package com.kyh.standard.JavaAdvance;

public class CopyRange {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newNumbers = copyOfRange(numbers, 3, 7);
        printArray(newNumbers);
    }

    public static int[] copyOfRange(int[] arry, int from, int to){
        int newLength = to - from + 1;
        int[] newArray = new int[newLength];
        for(int i = 0; i < newLength; i ++){
            newArray[i] = arry[from];
            from += 1; 
        } 
        return newArray;
    }

    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]);
        }
        System.err.println();
    }
}
