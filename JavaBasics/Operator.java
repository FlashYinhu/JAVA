public class Operator{
    public static void main(String[] args) {
        // 整数参与运算得到的结果就是整数
        System.out.println(10 / 3);
        // 小数参与运算得到的结果有可能不精确
        System.out.println(10.0 / 3);
        
        // 取模的应用场景可以判断是否可以除、判断奇偶性、斗地主发牌
        System.out.println(10 % 2);
        System.out.println(10 % 3);

        int a = 10;
        double b = a;
        System.out.println(b);
        
        // ASCII 小写a 97 大写A 65
        char c = 'K';
        System.out.println(1 + c);

        // 字符串的+操作
        String str1 = "Kang";
        String str2 = "Yinhu";
        System.out.println(str1 + str2); // KangYinhu
        System.out.println(1 + 2 + 3 + str1);// 6Kang
        System.out.println(3.14 + str1); // 3.14Kang
        System.out.println(str1 + true); // Kangtrue

        // 只要有字符串参与操作做的就是拼接操作
        System.out.println(1 + 2 + str1 + 3 + 4); //3Kang34

        // 自增自减运算符 先用后加/减
        int x = 10;
        // 后++ 先用后+ 
        int y = x++;
        // 先++ 先+后用
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 赋值运算符底层有类型转换
        short p = 1;
        p += 2; // p = (short)(p + 2)
        System.out.println(p+"\n");

        // 逻辑运算符
        System.out.println(true & false); //且
        System.out.println(true | false); //或
        System.out.println(true ^ false); // 异或 相同为假 不同为真
        System.out.println(!true); // 取反

        // 短路逻辑运算符 当左边的表达式能确定最终的结果 右边就不会参与运算
        // 短路与 &&
        // 两边都为真 结果才为真 
        int q = 4;
        int w = 5;
        boolean result = ++q < 5 && ++w <5;
        System.out.println(result);
        System.out.println(q);
        System.out.println(w); 
        // 短路或 ||
        // 两边都为假 结果才是假

        // 三目运算符
        a = 10;
        int d = 11;
        int bigOne = (a > d) ? a : d;
        System.out.println(bigOne); 

        // 优先级 () 小括号优先于所有
    }    
}