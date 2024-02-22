import java.util.Scanner;

public class Qiuzhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = sc.nextInt();
        boolean flag = true;
        // 如果说number 只能被1和7整除 则为质数 否则为合数
        for(int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                flag = false;
                System.out.println(i);
                // System.out.println("number不是一个质数");
                break;
            }
        }

        if(flag){
            System.out.println("number是一个质数");
        }else{
            System.out.println("number不是一个质数");
        }
        sc.close();
    }
}
