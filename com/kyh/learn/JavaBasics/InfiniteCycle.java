public class InfiniteCycle {
    public static void main(String[] args) {
        // while(true){
        //     System.out.println("hello!");
        // }
        // for(;;){
        //     System.out.println("hello!");
        // }

        // 循环的跳转控制语句
        for(int i = 1; i <= 5; i++){
            System.out.println("小老虎在吃第" + i + "个包子");
            if(i == 3){
                // 结束本次循环进行下一次循环
                // continue;

                // 结束整个循环
                break;
            }
        }
    }
}
