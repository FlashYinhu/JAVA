package StringDemo;

public class PhoneNumberBlock {
    public static void main(String[] args) {
        String phoneNumber = "18866668888";
        String secretNumber = phoneNumber.substring(4,8);// 包头不包尾 包左不包右 返回截取的小串
        System.out.println(secretNumber);
        String result = "";
        result = phoneNumber.substring(0, 3) + "XXXX" + phoneNumber.substring(7);
        System.out.println("加密后的电话号码为:" + result); 
    }

}
