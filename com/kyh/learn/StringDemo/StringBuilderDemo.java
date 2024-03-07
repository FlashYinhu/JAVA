package com.kyh.learn.StringDemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc"); // 添加数据 返回对象本身
        sb.append("def");
        System.out.println(sb.toString()); // StringBuilder 对象转String对象
        System.out.println(sb.reverse().toString()); // 反转容器中的内容
        System.out.println(sb.length()); // 返回长度（字符出现的个数）

        // 注意 StringBuilder 类已经写好 底层处理过 打印的对象不是地址值而是属性值
        System.out.println(sb);
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        System.out.println(sb);
        
        // 链式编程
        System.out.println(sb.reverse().append(10.25).toString().substring(0, 5).charAt(3));

    }
}
