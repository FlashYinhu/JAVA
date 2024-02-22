import java.util.Random;
import java.util.Scanner;

public class Caishuzi {
    public static void main(String[] args) {
        Random rd = new Random();
    // 0～bound-1 包头不包尾 包左不包右边
    // int num = rd.nextInt(10); // 0~9

    // 生成 7-15之间的随机数
    // int num2 = rd.nextInt(9) + 7;

    // 生成 1-100之间的随机数
    int num3 = rd.nextInt(100) + 1;

    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Please input your number");
        int guessNumber = sc.nextInt();
        if (guessNumber > num3){
            System.out.println("Too big!");
        }else if(guessNumber < num3){
            System.out.println("Too small!");
        }else{
            System.out.println("Bingo!");
            break;
        }
    }
    sc.close();
    }
}
