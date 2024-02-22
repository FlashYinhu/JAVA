public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // 利用循环访问代码
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
        
        // 动态初始化
        // 整数初始化0 小数初始化0.0 字符初始化 '/u0000' 空格
        // 布尔初始化为false 引用初始化null
        String[] students = new String[50];
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        // 动态初始化和静态初始化
        // 动态初始化手动指定数组长度 系统给定默认初始化值
        // 静态初始化 手动指定元素 系统根据元素个数 计算数组长度
    }
}
