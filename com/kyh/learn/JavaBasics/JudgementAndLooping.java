import java.util.Scanner;

public class JudgementAndLooping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 20){
            System.out.println("666!");
        }else{
            System.out.println("小趴菜!");
        }


        System.out.println("请输入你的成绩:");
        double score = sc.nextInt();
        if (score >= 95 && score <= 100){
            System.out.println("自行车！");
        }else if(score >= 90 && score <= 94){
            System.out.println("游乐场！");
        }else if(score >= 80 && score <= 89){
            System.out.println("变形金刚！");
        }else{
            System.out.println("你完了臭小子！");
        }

        int id = sc.nextInt();
        switch (id) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break; // case 穿透 如果匹配上了 没有break就会继续执行下一个case 的语句体 一直遇到break或者}为止
            default:
                System.out.println("Not 1 or 2!");
                break;
        }

        for (int i = 1 ; i <= 10; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
