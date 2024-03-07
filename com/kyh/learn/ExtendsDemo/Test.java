package com.kyh.learn.ExtendsDemo;

public class Test {
    public static void main(String[] args) {
        /*
         * 多态
         */
        Computer computer = new Computer("Intel", "AMD", 9899.0);
        Computer computer2 = new Dell("AMD", "Nvida", 9112.0, "Dell");
        Computer computer3 = new Ipad("APPLE", "APPLE", 9802.0, "APPLE");

        fun1(computer);
        fun1(computer2);
        fun1(computer3);
    }
    
    public static void fun1(Computer computer) {
        computer.showInfo();
    }
}
