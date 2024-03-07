package com.kyh.learn.StringDemo;

public class ArrayToString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.err.println(arrayToString(numbers));
    }

    public static String arrayToString(int[] arr){
        String result = "[";
        if(arr == null) {
            return "";
        }else if(arr.length == 0){
            return "[]";
        }
        for(int i = 0; i < arr.length; i ++) {
            int number = arr[i];
            if(i == arr.length - 1) {
                result = result + number + "";
            }else{
                result = result + number + ", ";
            }
        } 
        return result + "]";
    }
    
}
