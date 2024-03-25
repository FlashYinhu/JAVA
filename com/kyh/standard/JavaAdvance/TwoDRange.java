package com.kyh.standard.JavaAdvance;

public class TwoDRange {
    public static void main(String[] args) {
        // 建议把每一个一维数组写在一行
        String[][] stuInfo = {
            {"zhangsan", "male"},
            {"lisi", "male"},
            {"wangwu", "female"},
            {"zhaoliu", "female"}
        };
        System.out.println(stuInfo[0][0]);

        // 二维数组的动态初始化
        int[][] twoDRange = new int[7][8];
        int[][] twoDRange2 = new int[2][];
        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 4, 6};
        twoDRange2[0] = a1;
        twoDRange2[1] = a2;
        
    }
}
