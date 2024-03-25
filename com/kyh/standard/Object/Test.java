package com.kyh.standard.Object;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "iPhone";
        phone.price = 5999.99;
        phone.call();
        phone.playGame();

        PrivateDemo pd = new PrivateDemo(); 
        // 数据安全
        // 被private修饰的成员只能在本类中访问
        // pd.age = 1;

        Bridge bridge = new Bridge("Simions", 9011.22, "kyh");
        System.out.println(bridge.getBrand() + bridge.getPrice() + bridge.getMaker());
    }
}
