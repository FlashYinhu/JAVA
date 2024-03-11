import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要测试的字符串:");
            String testStr = sc.next();
//            if (testStr.matches("^([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[a-zA-Z](([DF]((?![IO])[a-zA-Z0-9](?![IO]))[0-9]{4})|([0-9]{5}[DF]))|[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1})$")) {
//                System.out.println("正确！");
//            } else {
//                System.out.println("错误！");
//            }

            if (testStr.matches("^(1\\d{10}|(?:\\d{3}-\\d{7,8}|\\d{4}-\\d{7,8}))$")){
                System.out.println("正确");
            } else {
                System.out.println("错误");
            }
        }
    }
}
