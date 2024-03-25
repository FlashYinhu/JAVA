package com.kyh.standard.StringDemo;

public class Test {
    public static void main(String[] args) {
        String str1 = "kangyinhu";
        String str2 = new String();
        String str3 = new String("脱裤子放屁");

        // 传递一个字符数组 根据字符数组的内容创建一个字符串
        // 需求 字符串不能发生改变
        // 如果要修改字符串 先变成字符数组 然后修改数组
        // "abc" -> ['a', 'b', 'c'] -> ['q', 'b', 'c'] -> "qbc"
        char[] characters = {'y', 'i', 'n', 'h', 'u'};
        String str4 = new String(characters);
        System.out.println(str4);

        // 传递字节数组
        // 需求 网络传输过程中字节信息转字符串
        byte[] bytes = {97, 98, 99, 100, 101};
        String str5 = new String(bytes);
        System.out.println(str5);

       

    }
}
