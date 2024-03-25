import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class Huiwenshu {
    public static void main(String[] args) {
        // int x = 12;
        // int ge = x % 10;
        // int shi = (x / 10) % 10;
        // int res = ge * 10 + shi;
        // if (res == x){
        //     System.out.println("This is a huiwenshu");
        // }else{
        //     System.out.println("This is not a huiwenshu");
        // }
        // 123456
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = sc.nextInt();
        int res = 0; 
        while(num != 0){
            int ge = num % 10;
            num = num / 10;
            res = res * 10 + ge;
        }
    }
}
