public class BasicDataTypes {
    public static void main(String[] args) {
        // =======整数========
        // byte -128~127 1Byte
        byte b = 126;
        // short -32768~32767 2Bytes
        short s = 32766;
        // int -2147483648~2147483647(10位数) 4Bytes
        int i = 2147483646;
        // long (19位数) 8Bytes
        // 注意 如果要定义long类型的变量 在数据值的最后要加上L
        long l = 12416751762213124L;

        // =======浮点数=======
        // float 4Bytes
        // 注意在定义float类型的时候 数据值的最后也需要加上一个F作为后缀
        float f = 3.1415926535F;
        // double 8Bytes
        double d = 3.1762415274516928416481219628463218;
        // =======字符型=======
        // char 0~65535 2Bytes 
        char c = '康';

        // =======布尔型=======
        // boolean true/false 1Byte
        boolean bl = true ;

        System.out.println();

    }
}
