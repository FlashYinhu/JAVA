package com.kyh.standard.PKGame;

public class Test {
    public static void main(String[] args) {
        Role r1 = new Role("东方不败", 100);
        Role r2 = new Role("金毛狮王", 100);
        while(true){
            r1.attack(r2);
            if (r2.getBlood() < 0){
                System.out.println(r1.getName() + " Win!");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() < 0){
                System.out.println(r2.getName() + " Win!");
                break;
            }
        }
    }
}
