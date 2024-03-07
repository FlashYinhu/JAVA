import java.util.Scanner;

public class Pingfanggeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a int");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i * i == num){
                System.out.println(i);
                break;
            }else if(i * i > num){
                System.out.println(i - 1);
                break;
            }
        }
        sc.close();
    }
}
