public class Shuzu {
    /* 
        数组是一种容器 可以存储同种数据类型的多个值
        在存储数据的时候需要结合隐式转换考虑
        int 可以存 byte short int
        double 可以存 byte short int float double
        但是都不可以存boolean
        建议数组类型和数据类型保持一致
    */
    public static void main(String[] args) {
        // 数组的定义格式
            // 数据类型[] 数组名 或者 数据类型 数组名[]

        // 静态初始化 初始化值长度固定
        int[] array = new int[]{11, 12, 13};
        double[] array2 = new double[]{11.1, 12.2, 13.3};

        int[] array3 ={1, 2, 3, 4, 5};
        System.out.println(array); // 数组容器在内存中的地址
        //[I@251a69d7
        /*
         * [ 表示当前是一个数组
         * I 表示当前数组里的元素都是int类型
         * @ 是间隔符号
         * 251a69d7是真正的地址值 十六进制
         */
        System.out.println(array3[0]);
        array2[0] = 2.71; // 一旦覆盖 原数据不存在

    }
}
