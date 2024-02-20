//导包
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);
        // 接收数据
        System.out.println("Please Input Two Numbers:");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i + j);
    }
}
