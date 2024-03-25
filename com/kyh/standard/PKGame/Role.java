package com.kyh.standard.PKGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    
    public Role(){}
    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return this.blood;
    }

    public void attack(Role r){
        Random rd = new Random();
        int damage = rd.nextInt(10) + 1;
        r.setBlood(r.getBlood() - damage);
        System.out.println(this.getName() + "举起拳头打了" + r.getName() + "一下" + "造成了" + damage + "点伤害, " + r.getName() + "还剩下" + r.getBlood() + "点血");
    }

}
