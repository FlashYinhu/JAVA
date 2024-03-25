package com.kyh.standard.MyUtils;

public class ArrUtil {
    // 私有化构造方法
    private ArrUtil() {};

    public static String printArr(int[] numbers) {
        // 拼接字符串用StringBuilder 提高代码效率
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < numbers.length; i ++){
            if(i != numbers.length - 1){
                sb.append(numbers[i] + ", ");
            }else{
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public static double getAverage(double[] numbers) {
        double sum = 0; 
        for(int i = 0; i < numbers.length; i ++){
            sum = sum + numbers[i];
        }
        return sum/(numbers.length);

    }
}
